package com.april23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        Stream<Integer> b=a.stream();
        List c=b.filter(S->S<20).collect(Collectors.toList());
        System.out.println(b.count());
	}

}
