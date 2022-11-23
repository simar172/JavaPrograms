package com.march20;

import java.io.IOException;
import java.lang.*;
import java.lang.reflect.Method;

public class q7 {

	public static void main(String[] args) throws  ClassNotFoundException{
		// TODO Auto-generated method stub
	    Class q1=Class.forName("com.march20.q5");
	    Method[] c1=q1.getDeclaredMethods();
	    for(Method m1:c1) {
	    	System.out.println(m1.getName());
	    }
	    
	}

}
