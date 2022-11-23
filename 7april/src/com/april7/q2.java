package com.april7;
class A implements Runnable{
	public void run() {
		for(int i=0;i<2000;i++) {
			System.out.println("thread--"+i);
		}
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a1=new A();
        Thread t=new Thread(a1);
        t.start();
        for(int i=0;i<2000;i++) {
        	System.out.println("main--"+i);
        }
	}

}
