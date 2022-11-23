package com.april23;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class q3 {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
        HashMap<Integer,String> a=new HashMap<Integer,String>();
        a.put(1,"a");
        a.put(2,"b");
        a.put(3,"c");
        a.put(4,"d");
        a.put(4,"e");
        Stream<String> b=a.values().stream();
        
        b.forEach(System.out::println);
	}

}
