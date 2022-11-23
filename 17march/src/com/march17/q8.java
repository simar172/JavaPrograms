package com.march17;

public class q8 {
	static void test1(int i,int...all) {
    	System.out.println("test1");
    }
	static void test2(int...all,int i) {
		System.out.println("test2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test2(1);
        
	}

}
