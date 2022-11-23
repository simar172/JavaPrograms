package imar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class let1 {
	 public int searchInsert(int[] nums, int target) {
	        int max=nums[0];
	       ArrayList<Integer> a=new ArrayList<>();
	       Collections.sort(a);
	       int b[]=new int[a.size()];
	       for(int i=0;i<nums.length;i++) {
	    	   a.add(nums[i]);
	       }
	       if(a.contains(target)) {
	            for(int i=0;i<nums.length;i++) {
	        	      if(nums[i]==target) {
	        	          max=i;
	        	     }
	              }
	        return max;
			}
	       else {
	    	   a.add(target);
	    	   Collections.sort(a);
	    	   int c=a.get(0);
	    	   for(int i=0;i<a.size();i++) {
	    		   if(a.get(i)==target) {
	    			   c=i;
	    		   }
	    	   }return c;
	       }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,3,5,6};
        int target=4;
        System.out.println(searchInsert(arr, target));
	}

}
