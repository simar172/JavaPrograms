package com.march29;

import java.util.TreeMap;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeMap list=new TreeMap();
        list.put(123,"hello");
        list.put(321,"hello");
        list.put(456,"hello");  //cannot add null in treemap+
        
        System.out.println(list);
        System.out.println(list.get(123));
	}

}
