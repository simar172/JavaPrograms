package com.april7;

public class q3 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Runnable r=new Runnable() {
        	 
        	 public void run() {
        		 for(int i=0;i<2000;i++) {
        			 System.out.println("thread--"+i);
        		 }
        	 }
         };
         Thread a=new Thread(r);
        		 a.start();
         for(int i=0;i<2000;i++) {
        	 System.out.println("main--"+i);
         }
	}

	

	

}
