package com.march20;

import java.lang.reflect.Field;

public class q9 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
       Class c1=Class.forName("com.march20.q5");
       Field[] c2=c1.getDeclaredFields(); 
       for(Field c3:c2) {
    	   System.out.println();
       }
       
	}

}
