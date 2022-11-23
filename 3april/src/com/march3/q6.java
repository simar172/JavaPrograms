package com.march3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class q6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File a=new File("C:\\Users\\Harnimarpreet\\Desktop\\simar12.txt");
        boolean c=a.createNewFile();
        FileWriter b=new FileWriter("C:\\Users\\Harnimarpreet\\Desktop\\simar12.txt");
        b.write("simar is her");
        b.close();
	}

}
