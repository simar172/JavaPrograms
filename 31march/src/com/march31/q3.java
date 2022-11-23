package com.march31;

import java.util.ArrayList;
import java.util.Iterator;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList a1=new ArrayList();
       a1.add(10);
       a1.add(20);
       a1.add(30);
       a1.add(40);
       Iterator it=a1.iterator();
//       a1.add(50);
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
    }

}
