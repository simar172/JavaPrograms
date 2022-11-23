package com.april23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        Stream<Integer> b=a.stream();
        List l=b.filter(S->S<40).collect(Collectors.toList());
        System.out.println(l);
	}

}
