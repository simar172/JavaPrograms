package com.april21;
interface A1{
	void  test();
}
class B1{
	void add() {
		System.out.println("A");
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A1 a1=new B1()::add;
        a1.test();
	}

}
