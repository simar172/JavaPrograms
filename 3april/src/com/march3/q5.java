package com.march3;

import java.io.File;
import java.io.IOException;

public class q5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File a=new File("C:\\Users\\Harnimarpreet\\Desktop\\1234.txt");
        File c=new File("C:\\Users\\Harnimarpreet\\Desktop\\simar.pdf");
        boolean b=a.createNewFile();
        boolean d=c.createNewFile();
        System.out.println(b);
        System.out.println(d);
	}

}
