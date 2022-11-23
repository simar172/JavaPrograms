package datastr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class k_max_sum {
	
	static ArrayList<Integer> sum(int a[],int b[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				pq.add(a[i]+b[j]);
			}
		}
		
		int count=0;
		ArrayList<Integer> ar=new ArrayList<>();
		while(count<k) {
			ar.add(pq.peek());
			pq.remove();
			count++;
		}
		return ar;
	}
	
	public static void main(String[] args) {
		 int A[] = { 4, 2, 5, 1 };
	        int B[] = { 8, 0, 5, 3 };
	        int N = A.length;
	        int K = 3;
	        
	        System.out.println(sum(A,B,K));
	 
	}
}
