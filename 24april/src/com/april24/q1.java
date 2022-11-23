package com.april24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> a=new ArrayList<Integer>();
       a.add(10);
       a.add(20);
       a.add(30);
       a.add(40);
       a.add(50);
       List li=a.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	   System.out.println(li);
	}

}
