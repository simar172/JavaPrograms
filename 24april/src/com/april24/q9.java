package com.april24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class q9  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        UnaryOperator<Integer> b=new UnaryOperator<Integer>() {
        	public Integer apply(Integer e) {
				return e*5;
        		
        	}
        };
        a.replaceAll(b);
        System.out.println(a);
	}

}
