package com.april14;
class Thread1 extends Thread{
	Test t;
	Thread1(Test t){
		this.t=t;
	}
	public void run() {
	
		try {
			t.i=10;
			System.out.println("1--->"+t.i);
			Thread.sleep(3000);
			System.out.println("2---->"+t.i);
			t.i=20;
			System.out.println("3--->"+t.i);
			Thread.sleep(3000);
			t.i=30;
			System.out.println("4--->"+t.i);
			Thread.sleep(3000);
			t.i=40;
			System.out.println("5--->"+t.i);
			Thread.sleep(3000);
			t.i=50;
			System.out.println("6--->"+t.i);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Thread2 extends Thread{
	Test t;
	Thread2(Test t){
		this.t=t;
	}
	
	public void run() {
		try {
			t.i=60;
			System.out.println("7--->"+t.i);
			Thread.sleep(3000);
			t.i=70;
			System.out.println("8--->"+t.i);
			Thread.sleep(3000);
			t.i=80;
			System.out.println("9--->"+t.i);
			Thread.sleep(3000);
			t.i=90;
			System.out.println("10--->"+t.i);
			Thread.sleep(3000);
			t.i=100;
			System.out.println("11--->"+t.i);
			Thread.sleep(3000);
			t.i=110;
			System.out.println("12--->"+t.i);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test t=new Test();
		Thread1 a=new Thread1(t);
		Thread2 b=new Thread2(t);
		t.i=105;
		a.start();
		b.start();
	}

}
