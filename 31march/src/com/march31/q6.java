package com.march31;

import java.util.ArrayList;
import java.util.ListIterator;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        ListIterator li=a1.listIterator();
        while(li.hasNext()) {
        	System.out.println(li.next());
        }
//        li.add(50);
        while(li.hasPrevious()) {
        	System.out.println(li.previous());
        }
        System.out.println(a1);
	}

}
