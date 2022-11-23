package datastr;

import java.util.*;

public class leet {
	
	
	
	public static int[] searchRange(int[] nums, int target) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				arr.add(i);
				break;
			}
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == target) {
				arr.add(i);
				break;
			}
		}
		
		int ans[]=new int[arr.size()];
        for(int i=0;i<ans.length;i++) {
        	ans[i]=arr.get(i);
        }
        if(arr.isEmpty()){
        	return null;
        }
		return ans;
	}

	public static void main(String[] args) {
      int ans[]= {5,7,7,8,8,10};
      System.out.println(searchRange(ans, 9));
	}
}
