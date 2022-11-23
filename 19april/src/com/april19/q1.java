package com.april19;
interface A{
	void test();
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a1=new A() {
        	public void test() {
        		System.out.println("test");
        	}
        	
        };
        a1.test();
	}

}
