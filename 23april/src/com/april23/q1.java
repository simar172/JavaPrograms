package com.april23;

import java.util.ArrayList;
import java.util.stream.Stream;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a=new ArrayList();
        a.add(20);
        a.add(30);
        a.add(40);
        Stream stream =a.stream();
        stream.forEach(System.out::println);
	}

}
