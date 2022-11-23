package com.april7;
class C extends Thread{
	public void run() {
	Thread a=Thread.currentThread();
	System.out.println(a.getName());
	}
}
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C a1=new C();
        a1.run();
        a1.start();
        }

}
