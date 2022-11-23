package com.march31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        Enumeration e1=Collections.enumeration(a1);
        while(e1.hasMoreElements()) {
        	System.out.println(e1.nextElement());
        }
        
	}

}
