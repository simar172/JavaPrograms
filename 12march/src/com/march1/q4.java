package com.march1;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(1);
        test1();
        System.out.println(2);
	}
	static void test1() {
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	static void test2() {
		try {
		System.out.println(5);
		test3();}
		catch( ArithmeticException e){
			System.out.println(e);
			}
		System.out.println(6);
	}
	static void test3() {
		System.out.println(7);
		int i=10/0;
		System.out.println(8);
	}

}
