package com.april26;

import java.util.HashMap;
import java.util.function.BiFunction;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> a=new HashMap<Integer,String>();
        a.put(1, "simar");
        a.put(2, "mimar");
        a.put(3, "himar");
        a.put(4, "gimar");
        a.put(5, "jimar");
        BiFunction<String ,String ,String >  e=new BiFunction<String ,String,String>(){

			@Override
			public String apply(String t, String u) {
				// TODO Auto-generated method stub
				return t+u;
			}};
			a.merge(5,"update" , (t,u)->t+u);
			System.out.println(a);
	}

}
