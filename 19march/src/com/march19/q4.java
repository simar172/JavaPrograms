package com.march19;
class A{
	void test() {
		System.out.println("simar");
	}
}
public class q4 extends A{
	@Override
	 void test() {
		System.out.println("misr");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a1=new A();
       a1.test();
       q4 a2=new q4();
       a2.test();
       
	}

}
