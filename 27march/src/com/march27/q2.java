package com.march27;

import java.util.PriorityQueue;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PriorityQueue a1=new PriorityQueue();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(5);      //cannot add different data types in priority queue
        System.out.println(a1);
//        System.out.println(a1.remove(10));
        System.out.println(a1);
        System.out.println(a1.peek());
        System.out.println(a1);
        System.out.println(a1.poll());
        System.out.println(a1);
        System.out.println(a1.poll());        // priority queue sorts all elements in ascending order
        System.out.println(a1);

        
        
	}

}
