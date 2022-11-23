package com.march20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class q8 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
        Class c1=Class.forName("com.march20.q7");
        Constructor[] c2=c1.getDeclaredConstructors();
        for(Constructor c:c2) {
        	System.out.println(c.getClass());
        }
        		}

}
