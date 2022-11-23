package palin;

import java.util.ArrayList;

public class sums {
	 public static int[] twoSum(int[] nums, int target) {
		 ArrayList a=new ArrayList<>();
         for(int i=0;i<nums.length;i++) {
        	 for(int j=i+1;j<nums.length;j++) {
        	 if((nums[i]+nums[j])==target) {
        		 a.add(nums[i]);
        		 a.add(nums[j]);
        		 return nums;
        		
        	 }
         }
         }
		return nums;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[]= {3,2,4};
        int target=6;
        System.out.println(twoSum(nums, target));
	}

}
