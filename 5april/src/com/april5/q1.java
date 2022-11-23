package com.april5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File f1=new File("C:\\Users\\Harnimarpreet\\Desktop\\123.txt");
	   FileReader f=new FileReader(f1);
	   BufferedReader br=new BufferedReader(f);
	   String st="";
	   while((st=br.readLine())!=null) {
		   System.out.println(st);
	   }
	}

}
