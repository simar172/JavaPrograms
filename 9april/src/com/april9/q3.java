package com.april9;
class C extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<2000;i++) {
			System.out.println("A--"+i);
		}
	}
}
class B extends Thread{
	public void run() {
		Thread a=Thread.currentThread();
		for(int i=0;i<2000;i++) {
			System.out.println("B--"+i);
		}
	}
}
public class q3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        C a1=new C();
        B a2=new B();
        a1.start();
        a2.start();
        a1.join();
        a2.join();
//        Thread.sleep(2000);
        for(int i=0;i<2000;i++) {
        	System.out.println("main---"+i);
        }
	}

}
