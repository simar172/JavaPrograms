package com.april9;
class A extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<2000;i++) {
			System.out.println("main----"+i);
		}
	}
}
public class q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       A a1=new A();
       a1.setDaemon(true);
       a1.start();
       for(int i=1;i<10;i++) {
    	   
    	   System.out.println("simar-"+i);
       }
	}

}
