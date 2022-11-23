package com.april24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class q5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f1=new File("D:\\");
        Stream<Path> a=Files.list(f1.toPath());
        a.forEach(System.out::println);
}

}
