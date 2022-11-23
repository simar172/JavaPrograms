package com.march20;

public class q5 {
       static void test(byte b) {
    	   System.out.println("simar");
       }
        static void test(double b) {
    	   System.out.println("double");
       }
       static void test(float b) {
    	   System.out.println("float");
       }
       static void test(int b) {
    	   System.out.println("int");
       }
       static void test(Float b) {
    	   System.out.println("Float");
       }
       static void test(Double b) {
    	   System.out.println("Double");
       }
       static void test(Byte b) {
    	   System.out.println("Byte");
       }
       static void test(Number b) {
    	   System.out.println("Number");
       }
       static void test(Object b) {
    	   System.out.println("Object");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b=10;
		test(b);
	}

}
