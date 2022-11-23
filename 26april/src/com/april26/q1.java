package com.april26;

import java.util.HashMap;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> a=new HashMap<Integer,String>();
        a.put(1,"simar");
        a.put(2,"mimar");
        a.put(3,"timar");
        a.put(4,"gimar");
        System.out.println(a.getOrDefault(5, "himar"));
        	}

}
