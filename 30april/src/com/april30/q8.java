package com.april30;
enum en1{
	A,B(10);
	en1(){
		System.out.println("const1");
	}
	en1(int i){
		System.out.println("const2");
	}
	{
		System.out.println("IIB");
	}
}

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        en1 a=en1.B;
	}

}
