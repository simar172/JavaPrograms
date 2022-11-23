package com.april21;
@FunctionalInterface
interface A{
	void test();
}
class B{
	static void test() {
		System.out.println("A");
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a1=B::test;
         a1.test();
	}

}
