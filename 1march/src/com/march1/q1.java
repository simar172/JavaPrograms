package com.march1;

class A{
	int i;
	A(int i){
		this.i=i;
	}
	public boolean equals(Object obj) {
		if(obj instanceof A){
			A a1=(A)obj;
			return i==a1.i;
		}
		else {
			return false;
		}
	
		
		}
}
class B{
	int i;
	B(int i){
		this.i=i;
	}
	public boolean equals(Object obj){
			B b1=(B)obj;
			return i==b1.i;
	}
}

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a1=new A(10);
       A a2=new A(5);
       B b1=new B(10);
       B b2=new B(11);
//       System.out.println(a1.equals(a2));
       System.out.println(a1.equals(b2));
       System.out.println(a1.equals(b1));
	}

}
