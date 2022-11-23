package datastr;

import java.util.PriorityQueue;

public class kth_element_using_priorityQueue {
    static int kth_largest(int arr[],int k) {
    	PriorityQueue<Integer> pq=new PriorityQueue<>();
    	for(int i=0;i<k;i++) {
    		pq.add(arr[i]);
    	}
    	for(int i=k;i<arr.length;i++) {
    		if(pq.peek()<arr[i]) {
    			pq.poll();
    			pq.add(arr[i]);
    		}
    	}
		return pq.peek();
    }
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> a=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        for(int i=1;i<k;i++){
            a.poll();
        }
        return a.peek();
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {20,10,60,30,50,40};
        System.out.println(kth_largest(arr, 3));
        System.out.println(kthSmallest(arr, 0, 0, 3));
	}

}
