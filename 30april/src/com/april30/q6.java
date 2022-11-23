package com.april30;
enum D{
	A,B(10),C("simar"),D;
	int i;
	String s;
	D(int j){i=j;s="no val";}
	D(){i=10;s="no val";}
	D(String s1){
		s=s1;
		i=10;
	}
	
	void print() {
		System.out.println("i="+i+"s="+s);
	}
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D b=D.A;
		D a=D.B;
        D a1=D.C;
        D a2=D.D;
        a.print();
        b.print();
        a1.print();
        a2.print();
	}

}
