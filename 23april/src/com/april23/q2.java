package com.april23;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> a=new HashSet<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        Stream<String> b=a.stream();
        b.forEach(System.out::println);
	}

}
