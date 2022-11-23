package com.april14;
class Thread4 extends Thread{
	ThreadLocal t;
	Thread4(ThreadLocal t){
		this.t=t;
	}
	public void run() {
		try {
			t.set(10);
			System.out.println("1-----"+t.get());
			Thread.sleep(3000);
			t.set(20);
			System.out.println("2------>"+t.get());
			Thread.sleep(3000);
			t.set(30);
			System.out.println("3------>"+t.get());
			Thread.sleep(3000);
			t.set(40);
			System.out.println("4-------->"+t.get());
			Thread.sleep(3000);
			t.set(50);
			System.out.println("5-------->"+t.get());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
class Thread3 extends Thread{
	ThreadLocal t;
	Thread3(ThreadLocal t){
		this.t=t;
	}
	public void run() {
		try {
			t.set(60);
			System.out.println("6-----"+t.get());
			Thread.sleep(3000);
			t.set(70);
			System.out.println("7------>"+t.get());
			Thread.sleep(3000);
			t.set(80);
			System.out.println("8------>"+t.get());
			Thread.sleep(3000);
			t.set(90);
			System.out.println("9-------->"+t.get());
			Thread.sleep(3000);
			t.set(100);
			System.out.println("10-------->"+t.get());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThreadLocal t=new ThreadLocal();
        Thread4 a=new Thread4(t);
        Thread3 b=new Thread3(t);
        a.start();
        b.start();
	}

}
