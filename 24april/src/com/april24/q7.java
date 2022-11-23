package com.april24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        Iterator<Integer> b=a.iterator();
        Consumer<Integer> c=new Consumer<Integer>() {
        	public void accept(Integer e) {
        		System.out.println(e);
        	}
        };
        b.forEachRemaining(c);
	}

}
