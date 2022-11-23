package datastr;

public class product_array_except {
	 public static void productExceptSelf(int[] nums) {
	        int n=nums.length;
	        int left[]=new int[n];
	        int right[]=new int[n];
	        int out[]=new int[n];
	        left[0]=1;
	        right[n-1]=1;
	        for(int i=1;i<n;i++){
	            left[i]=nums[i-1]*left[i-1];
	        }
	        for(int i=n-2;i>=0;i--){
	            right[i]=nums[i+1]*right[i+1];
	        }
	        for(int i=0;i<n;i++){
	            out[i]=left[i]*right[i];
	        }
	        for(int i=0;i<n;i++) {
	        	System.out.print(out[i]+" ");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[]= {1,2,3,4};
       productExceptSelf(nums);
	}

}
