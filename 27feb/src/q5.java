class D{
	int i;
	D(int i){
		this.i=i;
	}
}
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        D a1=new D(10);
        System.out.println(a1.i);
        D a2=new D(10);
        System.out.println(a2.i);
        System.out.println(a1.equals(a2));
       
	}

}
