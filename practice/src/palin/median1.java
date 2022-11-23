package palin;

import java.util.ArrayList;

public class median1 {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 if(nums1.length>nums2.length) {
		 int nums[][]= {nums1,nums2};
	        ArrayList<Double> a=new ArrayList<Double>();
	        for(int j=0;j<nums.length;j++) {
	            for(int i=0;i<nums[j].length;i++) {
	            	a.add((double) nums[j][i]);
	            }
	            }
	        double ans=0;
	       for(int k=0;k<a.size();k++) {
	    	   ans=ans+a.get(k);
	       }
	       return ans/a.size();}
		 else if(nums1.length==nums2.length) {
			 double max=nums1[0];
			 for(int i=0;i<nums1.length;i++) {
				 if(nums1[i]>max) {
					 max=nums1[i];
				 }
			 }
			 double max1=nums2[0];
			 for(int i=0;i<nums2.length;i++) {
				 if(nums2[i]>max) {
					 max1=nums2[i];
				 }
			 }
			 int nums[][]= {nums1,nums2};
		        ArrayList<Double> a=new ArrayList<Double>();
		        for(int j=0;j<nums.length;j++) {
		            for(int i=0;i<nums[j].length;i++) {
		            	a.add((double) nums[j][i]);
		            }
		            }return (max+max1)/a.size();
		 }
		return 0;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[]= {1,3};
       int num1[]= {2,7};
       System.out.println(findMedianSortedArrays(num, num1));
	}

}
