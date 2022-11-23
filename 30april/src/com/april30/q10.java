package com.april30;
enum en3{
	A,B(10);
	en3(int i){
		System.out.println("cosnt1-param");
	}
	en3(){
		System.out.println("const2-nonparam");
	}
	static {
		System.out.println("static");
	}
}
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        en3 a=en3.A;
//        System.out.println(a);
	}

}
