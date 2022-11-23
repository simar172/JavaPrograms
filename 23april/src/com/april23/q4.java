package com.april23;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4};
        IntStream s=Arrays.stream(arr);
        s.forEach(System.out::println);
	}

}
