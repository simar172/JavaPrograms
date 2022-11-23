package com.march27;

import java.util.Comparator;
import java.util.PriorityQueue;
class A implements Comparable{
	int i;
	A(int i){
		this.i=i;
	}
	
	@Override
	public int compareTo(Object obj) {
		A a1=(A)obj;
		return i-a1.i;
	}
	public String toString() {
		return "i="+i;
	}
	
}

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PriorityQueue a1=new PriorityQueue();
        a1.add(new A(40));
        a1.add(new A(20));
        System.out.println(a1);
        }

}
