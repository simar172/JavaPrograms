class B{
	int i;
	B(int i){
		this.i=i;
	}
	public String toString() {
		return "i="+i;
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B a1=new B(10);
         System.out.println(a1);
         B a2=new B(15);
         System.out.println(a2);
         B a3=new B(20);
         System.out.println(a3);
	}

}
