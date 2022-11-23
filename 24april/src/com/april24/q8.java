package com.april24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> a=new ArrayList<Integer>();
       a.add(1);
       a.add(2);
       a.add(3);
       a.add(4);
       a.add(5);
       a.add(6);
       Predicate<Integer> p=new Predicate<Integer>() {
    	   public boolean test(Integer e) {
    		   return e%2==0;
    	   }
       };
       a.removeIf(p);
       a.removeIf(S->S%2==0);
       System.out.println(a);
	}

}
