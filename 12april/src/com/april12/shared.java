package com.april12;

public class shared {
        synchronized void test() {
        	System.out.println("started");
        	try {
        		wait();
        	}
        	catch(InterruptedException e) {
        		System.out.println(e);
        	}
        	System.out.println("end");
        }
        synchronized void test1() {
        	notify();
        }
}
