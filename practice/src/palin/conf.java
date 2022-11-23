package palin;

class A{
	int i;
	int j;
	A(int i,int j){
		this.i=i;
		this.j=j;
	}
}
public class conf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A a1=new A(10,15);
    A a2=new A(10,15);
    System.out.println(a1.equals(a2));
	}

}
