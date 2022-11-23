package com.march6;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	 String s=args[0];
    	  int i=Integer.parseInt(s);
    	  System.out.println(i);
    	  double k=i/(i-9);
       }
       catch(ArithmeticException e) {
    	   System.out.println(e);
       }
       catch(NumberFormatException f) {
    	   System.out.println(f);
       }
       catch(ArrayIndexOutOfBoundsException g) {
       System.out.println(g);
       }
       finally {
    	   System.out.println("final");
       }
       System.out.println("After final");
	}

}
