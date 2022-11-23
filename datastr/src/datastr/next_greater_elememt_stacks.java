package datastr;

import java.util.*;

public class next_greater_elememt_stacks {
	public static void greatest(int arr[]) {
		Stack<Integer> a=new Stack<>();
		 for(int i=arr.length-1;i>0;i--) {
			 while(!a.isEmpty() && a.peek()>arr[i]) {
				 a.pop();
			 }
			 if(a.isEmpty()) {
				 System.out.println("-1");
			 }
			 else {
				 System.out.println(a.peek());
			 }
			 a.push(arr[i]);
		 }
	 }
	
//	gfg type//
	
	//1342
	//
	 public static long[] nextLargerElement(long[] arr, int n)
	    { 
	        // Your code here
	       long ans[]=new long[arr.length];
	       ans[n-1]=-1;
	       Stack<Long> a=new Stack<>();
	       a.push(arr[n-1]);
	       for(int i=arr.length-2;i>=0;i--){
	           while(!a.isEmpty() && a.peek()<arr[i]){
	               a.pop();
	           }
	           if(a.isEmpty()){
	               ans[i]=-1;
	           }
	           else{
	               ans[i]=a.peek();
	           }
	           a.push(arr[i]);
	       }return ans;
	    } 
	 
	 public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
	        int n=A.size();
	        Stack<Integer> st=new Stack<>();
	        ArrayList<Integer> arr=new ArrayList<>();
	        for(int i=0;i<n;i++){
	            while(st.size()!=0 || st.peek()>=A.get(i)){
	                st.pop();
	            }
	            if(st.size()==0){
	                arr.set(i, -1);
	            }
	            else{
	                arr.set(i,st.peek());
	            }
	            st.push(A.get(i));
	        }return arr;
	        
	            }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long arr[]= {1,3,4,2};
        System.out.println(nextLargerElement(arr,arr.length));

}}
