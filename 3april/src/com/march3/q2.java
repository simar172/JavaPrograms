package com.march3;
class GH<M,T>{
	int a;
	M b;
	T c;
	GH(int a,M b,T c){
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GH<String,String> a1=new GH<String,String>(10, "simat", "dima");
       System.out.println(a1.a);
       System.out.println(a1.b);
       System.out.println(a1.c);
	}

}
