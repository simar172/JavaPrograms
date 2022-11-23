package palin;
class A{
	int i;
	A (int i){
		this.i=i;
	}
	public boolean equals(Object obj) {
		return (obj instanceof A) && (i==((A)obj).i);
	}
}
class B{
	int i;
	B(int i){
		this.i=i;
	}
	public boolean equals(Object obj) {
		B a2=(B)obj;
		return i==a2.i;
	}
}

public class instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a1=new A(10);
         A a3=new A(10);
         B a2=new B(11);
         System.out.println(a1.equals(a3));
	}

}
