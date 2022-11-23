package com.april24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> a=new ArrayList<Integer>() ;
        	Comparator<Integer> c=new Comparator<Integer>() {
        		public int compare(Integer o1,Integer o2) {
        			return o1.compareTo(o2);
        		}
        		};
        
        a.add(100);
        a.add(20);
        a.add(300);
        a.add(40);
        a.add(50);
        a.sort(c);
        System.out.println(a);
	}

}
