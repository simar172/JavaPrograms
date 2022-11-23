package com.march17;

class Agenegative extends RuntimeException {
	Agenegative(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

public class q3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age=0;
        if(age<=0) {
        	throw new Agenegative("age cannot be negative");
        }
	}

}
