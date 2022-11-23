package datastr;

import java.util.Arrays;

public class kadane_algo {
//	works for negative as well as postive values
	public static int kadane(int[] nums) {
        int maxsum=nums[0];
        int currsum=0;
        if(nums.length<=1) {
 			return nums[0];
 		 }
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
            
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }
        }return maxsum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {-1};
          System.out.println(kadane(arr));
	}

}
