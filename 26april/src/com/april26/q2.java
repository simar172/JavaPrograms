package com.april26;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> a=new HashMap<Integer,String>();
        a.put(1, "simar");
        a.put(2, "timar");
        a.put(3, "mimar");
        a.put(4, "gimar");
        a.put(5, "yimar");
        a.putIfAbsent(6, "himar");
        System.out.println(a);
	}

}
