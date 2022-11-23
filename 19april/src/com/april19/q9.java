package com.april19;
interface J{
	default void test() {
		System.out.println("simar");
	}
}
interface L{
	default void test() {
		System.out.println("test");
	}
}
class O implements J,L{


	public void test() {
		// TODO Auto-generated method stub
		System.out.println("sima");
	}
	
}
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        O a1=new O();
        a1.test();
	}

}
