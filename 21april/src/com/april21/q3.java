package com.april21;
interface A2{
	void test(int i);
}
class B2{
	void add(int i) {
		System.out.println("Add");
	}
	static void add1(int i) {
		System.out.println("add1");
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A2 a2=B2::add1;
        A2 a3=new B2()::add;
        a3.test(0);
        a2.test(0);
        }

}
