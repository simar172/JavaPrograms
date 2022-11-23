package com.april24;

import java.util.ArrayList;
import java.util.stream.Stream;

public class q4{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<100;i++) {
        	a.add(i);
        }
        Stream<Integer> li=a.stream();
        li.forEach(System.out::println);
        Stream<Integer> li1=a.parallelStream();
        
        li1.forEach(System.out::println);
	}

}
