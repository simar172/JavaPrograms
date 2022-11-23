package datastr;
import java.util.*;
public class three_sum {
	
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]+nums[j]+nums[k])==0){
                        List<Integer> b=new ArrayList<>();
                        b.add(nums[i]);
                        b.add(nums[j]);
                        b.add(nums[k]);
                        Collections.sort(b);
                        a.add(b);
                    }
                }
            }
        }a=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(a));
        return a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[]= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
	}

}
