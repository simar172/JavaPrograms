package com.april21;
interface A3{
	void test(int i,String s1);
} 
class B3{
	void add(int i,String s1) {
		System.out.println(i+s1);
	}
	
	static void add1(int i,String s1) {
		System.out.println("static "+i+s1);
	}
}
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A3 a1=B3::add1;
        A3 a2=new B3():: add;
        a1.test(0, "sim");
        a2.test(0, null);
	}

}
