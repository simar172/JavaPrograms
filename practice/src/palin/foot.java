package palin;

public class foot {
//	{4,2,0,2,2,1,4,4,1,4,3,2}; 4
	public static int removeElementOptimized(int[] nums, int val) {
	    int n=nums.length;
	    int placeHere=0;
	    int i=0;
	    for(i=0;i<n;i++){
	        if(nums[i]!=val){
	            int temp=nums[i];
	            nums[i]=nums[placeHere];
	            nums[placeHere]=temp;
	            placeHere++;
	        }
	    }
	    for(int i1=0;i1<nums.length;i1++) {
	    	System.out.println(nums[i1]);
	    }
	    return placeHere;
	}
	public static int removeElementOptimized1(int[] nums, int val) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
		   if(nums[i]!=val) {
			   int temp=nums[i];
			   nums[i]=nums[count];
			   nums[count]=temp;
			   count++;
		   }
	   }
		return count;
	}
	 public int removeDuplicates(int[] nums) {
		 int count=0;
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i+1;j<nums.length;j++) {
				 if(nums[i]!=nums[j]) {
					 count++;
				 }else {
				 int temp=nums[i];
				 nums[i]=nums[count];
				 nums[count]=temp;
				 }
			 }
			 
		 }
	        return count;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,2};
	    int val =4;
	    int res = removeElementOptimized1(nums,val);
	    System.out.println(res);
	}

}
