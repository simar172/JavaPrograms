package palin;

import java.util.Arrays;
import java.util.HashSet;

public class dups1 {
public static boolean containsDuplicate(int[] nums) {
	     HashSet<Integer> a=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
        	if(a.contains(nums[i])) {
        		return true;
        	}
        	else {
        		a.add(nums[i]);
        	}
        	
        }return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[]= {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
	}

}
