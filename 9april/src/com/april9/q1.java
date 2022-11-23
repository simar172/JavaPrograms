package com.april9;
class A extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		t.getName();
		for(int i=0;i<2000;i++) {
			System.out.println("main---"+i);
		}
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a1=new A();
        a1.start();
        a1.setName("simar");
        a1.setPriority(10);
	}

}
