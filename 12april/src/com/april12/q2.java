package com.april12;
class C extends Thread{
	C(ThreadGroup tg){
		super(tg,"A");
	}
	public void run() {
		for(int i=0;i<2000;i++) {
			System.out.println("C"+i);
		}
	}
} 
class D implements Runnable{
	public void run() {
		for(int i=0;i<2000;i++) {
			System.out.println("D"+i);
		}
	}
}
public class q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ThreadGroup a=new ThreadGroup("simar");
        C b =new C(a);
        D c=new D();
        Thread t=new Thread(a,c);
        b.start();
        t.start();
        Thread.sleep(1000);
        a.stop();
	}

}
