package com.april5;

class A extends Thread{
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("simar");
		}
	}
}

public class q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        A a1=new A();
        a1.start();
        
        for(int i=0;i<1000;i++) {
       
        	System.out.println("nimar");
        }
        
	}

}
