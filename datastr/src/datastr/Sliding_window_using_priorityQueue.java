package datastr;

import java.util.PriorityQueue;

public class Sliding_window_using_priorityQueue {
    public static int pq(int arr[],int k) {
    	PriorityQueue<Integer> a=new PriorityQueue<>();
    	for(int i=0;i<k;i++) {
    		a.add(arr[i]);
    	}
    	for(int i=k;i<arr.length;i++) {
    		if(a.peek()<arr[i]) {
    			a.poll();
    			a.add(arr[i]);
    		}
    		
    	}
    	
		return a.peek();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(pq(arr, k));
	}

}
