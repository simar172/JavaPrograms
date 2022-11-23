package com.april19;
interface F{
	int test();
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        F a1=()->{
        	System.out.println("simar");
        	System.out.println("test");
			return 0;
        };
        F a2=()->50;
        a1.test();
        System.out.println(a2.test());
	}

}
