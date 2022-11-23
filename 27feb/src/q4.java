class C{
	int i;
	int j;
	C(int i,int j){
		this.i=i;
		this.j=j;
	}
	public String toString() {
		return "i="+i+",j="+j;
	}
}


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C a1=new C(10,15);
        System.out.println(a1);
        C a2=new C(10,15);
        System.out.println(a2);
        C a3=new C(10,15);
        System.out.println(a3);
	}

}
