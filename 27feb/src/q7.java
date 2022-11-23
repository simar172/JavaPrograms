class F{
	int i;
	F(int i){
		this.i=i;
	}
	public boolean equals(Object obj) {
		F a1=(F)obj;
		return i==a1.i;
	}
}
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        F a1=new F(2);
        F a2=new F(2);
        System.out.println(a1.equals(a2));
        
	}

}

