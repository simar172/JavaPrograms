class E{
	int i;
	E(int i){
	this.i=i;	
	}
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        E a1=new E(2);
        E a2=new E(3);
        E a3=a1;
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a2.equals(a3));
	}

}
