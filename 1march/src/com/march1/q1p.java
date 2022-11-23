package com.march1;
class G{
	int i;
	G(int i){
		this.i=i;
	}
	public boolean equals(Object obj) {
		 return (obj instanceof G) && (i==((G)obj).i);
	}
}
class F{
	int i;
	F(int i){
		this.i=i;
	}
	public boolean equals(Object obj) {
		F e1=(F)obj;
		return i==e1.i;
	}
}
public class q1p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        G a1=new G(10);
        F e1=new F(10);
        System.out.println(a1.equals(e1));
	}

}
