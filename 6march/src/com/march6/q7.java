package com.march6;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	System.out.println(1);
        	int i=10/0;
        	System.out.println(2);
        }
        catch(ArithmeticException e) {
        	System.out.println(e);
        }
        finally {
        	System.out.println("final");
        }
        System.out.println("after final");
	}

}
