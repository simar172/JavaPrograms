package datastr;

import java.util.PriorityQueue;
//time complexity is O(nlogn)
public class connect_n_ropes_with_minimum_cost {
     public static void ropes(int arr1[]) {
    	 PriorityQueue<Integer> a=new PriorityQueue<>();
    	 for(int i=0;i<arr1.length;i++) {
    		 a.add(arr1[i]);  //chote digit se shuru krenge because minimum cost nikalni hai or Priority Queue lagane se element sort ho jayenge to chote elements asaani se miljayenge
    	 }
    	 int ans=0;
    	 while(a.size()>1) {
    		 int first=a.poll();
    		 int second=a.poll();
    		 int sum=first+second;
    		 ans+=sum;
    		 a.add(sum);
    	 }
		System.out.println( ans);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {2,5,4 ,8,6,9};
       ropes(arr);
	}

}
