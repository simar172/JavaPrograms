package com.march29;

import java.util.HashMap;



public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap list=new HashMap();
        list.put("hello",123);
        list.put(null,123);
        list.put("",true);
        System.out.println(list);
        System.out.println(list.get(null));
	}

}
