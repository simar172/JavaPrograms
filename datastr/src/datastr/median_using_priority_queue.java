package datastr;

import java.util.Collections;
import java.util.PriorityQueue;

public class median_using_priority_queue {
	static PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
	static PriorityQueue<Integer> minheap=new PriorityQueue<>();
     public static void insertnum(int num) {
    	if(  maxheap.isEmpty() ||maxheap.peek()>num) {
    		 maxheap.add(num);
    	 }
    	 else {
    		 minheap.add(num);
    	 }
    	 if(maxheap.size()>minheap.size()+1) {
    		 minheap.add(maxheap.poll());
    	 }
    	 else if(maxheap.size()<minheap.size()){
    		 maxheap.add(minheap.poll());
    	 }
     }
     public static int median() {
    	 if(maxheap.size()==minheap.size()) {
    		 return (maxheap.peek()+minheap.peek())/2;
    	 }
    	 return maxheap.peek();
     }
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        insertnum(3);
        insertnum(1);
        System.out.println(median());
        insertnum(5);
        System.out.println(median());
	}

}
