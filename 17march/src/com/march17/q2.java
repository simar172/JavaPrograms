package com.march17;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if(age<=0) {
        	throw new ArithmeticException("ag is neg");
        }
 	}

}
