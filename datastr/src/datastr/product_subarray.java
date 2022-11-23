package datastr;

import java.util.Arrays;

public class product_subarray {
	 public static void maxProduct(int[] nums) {
		 Arrays.sort(nums);
//	      -2,2,3,4
		 int a=1;
		for(int i=0;i<2;i++) {
			for(int j=1;j<2;j++) {
				a=nums[i]*nums[j];
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=1;j<2;j++) {
				a=nums[i]*nums[j];
			}
		}
		
		 System.out.println(a);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[]= {2,3,-2,4};
        maxProduct(nums);
	}

}
