package com.march31;

import java.util.ArrayList;
import java.util.ListIterator;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList a1=new ArrayList();
       a1.add(10);
       a1.add(20);
       a1.add(30);
       a1.add(40);
       ListIterator li=a1.listIterator();
       li.add(50);
       while(li.hasNext()) {
    	   System.out.println(li.next());
       }
       System.out.println(a1);
	}

}
