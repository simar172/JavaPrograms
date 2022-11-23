package com.march3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class q7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File f=new File("C:\\Users\\Harnimarpreet\\Desktop\\simar");
       File f1=new File("C:\\Users\\Harnimarpreet\\Desktop\\simar\\simar1234.txt");
       f.mkdir();
       boolean f2=f1.createNewFile();
      FileWriter f3=new FileWriter("C:\\Users\\Harnimarpreet\\Desktop\\simar\\simar1234.txt");
      f3.append("simar was heredadada");
      f3.close();
	}

}
