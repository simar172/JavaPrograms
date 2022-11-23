package com.april5;
interface F{
	public void test();
}
class B implements F{
	public void test() {
		System.out.println("simar");
	}
}

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        F a1=new F() {
        	public void test() {
        		System.out.println("mithi");
        	}
        };
        a1.test();
        B b1=new B();
        b1.test();
	}

}
