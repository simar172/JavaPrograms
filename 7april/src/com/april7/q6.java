package com.april7;
class B  extends Thread{
    public void run() {
    	Thread a=Thread.currentThread();
    	System.out.println(a.getName());
    }
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          B a1=new B();
         a1.run();
        for(int i=0;i<2000;i++) {
        	System.out.println("main--"+i);
        }
	}

}
