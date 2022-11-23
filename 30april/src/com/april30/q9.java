package com.april30;
enum en2{
	A,B(10);
	en2(int i){
		System.out.println("const");
	}
}
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        en2 a=en2.B;
        System.out.println(a);
	}

}
