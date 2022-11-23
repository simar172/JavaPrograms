 package com.march27;

import java.util.LinkedList;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList a1=new LinkedList();
        a1.add(3600);
        a1.add(200);
        a1.add("test");
        a1.add(true);
        a1.add(4);
        System.out.println(a1);
        System.out.println(a1.removeFirst());
        System.out.println(a1);
        a1.addFirst(400);
        System.out.println(a1);
        System.out.println(a1.peek());
        System.out.println(a1);
        System.out.println(a1.poll());
        System.out.println(a1);
	}

}
