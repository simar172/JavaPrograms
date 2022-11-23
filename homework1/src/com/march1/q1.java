package com.march1;
class F{
	String i;
	int j;
	int k;
	F(String i,int j,int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public boolean equals(Object obj) {
		F a1=(F)obj;
		return i==a1.i && j==a1.j && k==a1.k;
		
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        F a1=new F("simar",2,3);
        F a2=new F("simar",2,5);
        System.out.println(a1.equals(a2));
	}

}
