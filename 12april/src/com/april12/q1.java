package com.april12;
class A extends Thread{
	shared s;
	A(shared s){
		this.s=s;
	}
	public void run() {
		s.test();
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          shared s=new shared();
          A a1=new A(s);
          a1.start();
          try {
			Thread.sleep(1000i88uij);
		} 
          catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          s.test1();
	}

}
