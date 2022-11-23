package com.april23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        Predicate<Integer> p=new Predicate<Integer>() {
        	public boolean test(Integer e) {
        		return e%2==0;
        	}
        	};
        	Stream<Integer> s=a.stream();
        	List b=s.filter(p).collect(Collectors.toList());
            System.out.println(b);
	}

}
