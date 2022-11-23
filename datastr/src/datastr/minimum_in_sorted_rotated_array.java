package datastr;

import java.util.Arrays;

public class minimum_in_sorted_rotated_array {
	 public static int findMin(int[] nums) {
	        Arrays.sort(nums);
	        return nums[0];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int nums[]= {4,5,6,7,0,1,2};
          System.out.println(findMin(nums));
	}

}
