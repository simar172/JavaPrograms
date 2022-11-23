package com.Os;

import java.util.LinkedList;

public class producer_consumer {
	static class producer_consumer1{
		LinkedList<Integer> a=new LinkedList<Integer>();
		int capacity=2;
		void produce() throws InterruptedException{
			int value=0;
		while(true) 
		   synchronized(this) 
		   {
			while(a.size()==capacity) {
				wait();
			}
		    System.out.println("producer"+value);
		    a.add(value);
		    value++;
		    notify();
		    Thread.sleep(1000);
		}
		}
		void consume() throws InterruptedException {
			while(true) 
			synchronized (this) 			
			{
			while(a.size()==0) {
				wait();
			}
			int val=a.removeFirst();
			System.out.println("consumer "+val);
			notify();
			Thread.sleep(1000);
		}
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        producer_consumer1 pc=new producer_consumer1();
        Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}); 
        Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
        t.start();
        t1.start();
	}

}
