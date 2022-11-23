class G{
	int i;
	int j;
	G(int i,int j){
		this.i=i;
		this.j=j;
	}
	public boolean equals(Object obj) {
		G a1=(G)obj;
		return (i==a1.i) && (j==a1.j);
	}
}
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        G a1=new G(10,15);
        G a2=new G(10,15);
        G a3=new G(12,15);
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a3));
        System.out.println(a3.equals(a1));
	}

}
