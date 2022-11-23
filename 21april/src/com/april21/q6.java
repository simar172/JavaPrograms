package com.april21;
interface A5{
	int test();
}
class B5{
	int add() {
		return 10;
	}
	static double add1() {
		return 11;
	}
	static byte add2() {
		return 11;
	}
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A5 a1=B5::add2;
        A5 a2=new B5()::add;
        System.out.println(a1.test());
        System.out.println(a2.test());
	}

}
