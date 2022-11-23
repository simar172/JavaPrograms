package com.march27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet a1=new HashSet();
       a1.add(10);
       a1.add(20);
       a1.add(30);
       a1.add(10);   //doesnot allow duplicate elements adnd doesnot maintains order
       a1.add(40);
       PriorityQueue a2=new PriorityQueue(a1);
//       Collections.sort(a2);
       System.out.println(a2); 
       

	}

}
