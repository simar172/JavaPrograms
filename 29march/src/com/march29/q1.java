package com.march29;

import java.util.HashMap;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap list1=new HashMap();
        list1.put("Hello123",123);
        list1.put(123,"test");
        list1.put("test123",123);
        list1.put("",123);
        System.out.println(list1);
        System.out.println(list1.get("Hello123"));
	}

}
