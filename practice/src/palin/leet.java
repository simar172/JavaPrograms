package palin;

	 
	
public class leet {
public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high) {
        	int mid=(low+high)/2;
        	if(nums[mid]==target ) {
        		return mid;
        	}
        	if(nums[mid]>=nums[low]) {
        		if(target>=nums[low] && target<=nums[mid]) {
        			high=mid-1;
        		}
        		else{
        			low=mid+1;
        		}
        	}
        	else {
        		if(target>=nums[mid] && target<=nums[high]) {
        			low=mid+1;
        		}
        		else {
        			high=mid-1;
        		}
        	}
        }
		return -1;
    }

static int binarySearch(int arr[], int start, int end, int target){
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) start = mid + 1;
        else end = mid - 1;
    }
    return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[]= {4,5,6,7,0,1,2};
       int target=0;
       System.out.println(search(nums, target));
       System.out.println(binarySearch(nums,0,nums.length-1,0));
	}

}
