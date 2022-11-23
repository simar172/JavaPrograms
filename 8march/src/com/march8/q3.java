package com.march8;

public class q3 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=test(args[0]);
	     System.out.println(i);}
	     static int test(String s1) {
	    	 try {
	    		 int i=Integer.parseInt(s1);
	    		 return i;
	    	 }
	    	 catch(NumberFormatException e) {
	    		 System.out.println(e);
	    		 return 100; 
	    	 }
	    	 return 200;
	     }
	      
	}



