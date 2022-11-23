package homework1;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a<b) {
        	if(a<c) {
        		System.out.println("a is less"+a);
        	}
        	else {
        		System.out.println("c is less"+c);
        	}
        }
        
        else if(b<a){
        	if(b<c) {
        		System.out.println("b is less"+b);
        	}
        	else {
        		System.out.println("c is less"+c);
        	}
        }
        else {
        	System.out.println("all are equal");
        }
	}
	}
