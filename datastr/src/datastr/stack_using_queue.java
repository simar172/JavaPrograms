package datastr;

import java.util.Queue;

public class stack_using_queue {
     static Queue q1;
     static Queue q2;
     public static void push1(int data) {
    	 while(!q1.isEmpty()) {
    		 q2.add(q1.remove());
    	 }
    	 q1.add(data);
    	 while(!q2.isEmpty()) {
    		 q1.add(q2.remove());
    	 }
     }
     public static int pop() {
    	 return (int) q1.poll();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         push1(10);
	}

}
