package com.march31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList a1=new ArrayList();
         a1.add(10);
         a1.add(20);
         a1.add(30);
         a1.add(40);
         Enumeration e1=Collections.enumeration(a1);
         while(e1.hasMoreElements()) {
        	 System.out.println(e1.nextElement());
        	
         }
         System.out.println("==========================");
         a1.add(50);
         Enumeration e2=Collections.enumeration(a1);
         while(e2.hasMoreElements()) {
        	 System.out.println(e2.nextElement());
         }
	}

}
