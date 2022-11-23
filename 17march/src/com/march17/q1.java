package com.march17;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{
        	int i=10/0;
        }
        catch(Exception e) {
    		System.out.println(e);
    	}
        catch(ArithmeticException e) {
        	System.out.println(e);
        }
	}
	

}
