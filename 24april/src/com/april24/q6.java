package com.april24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class q6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f1=new File("C:\\Users\\Harnimarpreet\\Desktop\\queue and stack.txt");
        Stream<String> a=Files.lines(f1.toPath());	
        a.forEach(System.out::println);
	}

}
