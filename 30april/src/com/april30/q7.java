package com.april30;
enum en{
	
	A,
	B{
		void test() {
			System.out.println("specific B");
		}
	}
	,C,D,
	E{
		void test() {
			System.out.println("Specific e");
		}
	};
	
void test() {
		System.out.println("general");
	}
}
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        en a=en.B;
        en b=en.D;
        en c=en.E;
        a.test();
        b.test();
        c.test();
	}
	
}
