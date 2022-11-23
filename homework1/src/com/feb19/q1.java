package com.feb19;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=s.next();
        System.out.println("enter the character");
        char c = s.next().charAt(0);   
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)==c) 
        		System.out.println("present on "+s1.indexOf(c));
       }
       
	}
	}

