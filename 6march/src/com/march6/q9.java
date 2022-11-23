package com.march6;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int i=10/0;
        }
        catch(ArithmeticException e)  {
        	System.out.println(e);
        	System.out.println("----");
        	System.out.println(e.getMessage());
        	System.out.println("---");
        	e.printStackTrace();
        }
        
	}

}
