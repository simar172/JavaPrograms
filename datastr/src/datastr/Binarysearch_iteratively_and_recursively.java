package datastr;

public class Binarysearch_iteratively_and_recursively {
	public static int great(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(arr[mid]<=key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
     public static int greatrec(int arr[],int key,int low,int high) {
    	 if(low>high) {
    		 return -1;
    	 }
    	 
    	 int mid=(low+high)/2;
    	 if(arr[mid]<key) {
    		 return greatrec(arr, key, mid+1, high);
    	 }
    	 if(arr[mid]==key) {
    		 return mid;
    	 }
    	 else {
    		 return greatrec(arr, key, low, mid-1);
    	 }
     } 
     
     public static int search_infinite(int arr[],int key) {
//    	 work only for infinite array and timecomplexity is O(log n)
    	 int low=0;
    	 int high=1;
    	 while(arr[high]<key) {
    		 low=high;
    		 high=high*2;
    	 }
    	 return greatrec(arr, key, low, high);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {1,2,4,5,6,7,8,9,10,11,12,13,14,15,16};
         int key=16;
         System.out.println("=========iteratively=============");
         System.out.println(great(arr, key));
         System.out.println("=========recursively=============");
         System.out.println(greatrec(arr, key, 0, arr.length-1));
         System.out.println("==============infinite loop================");
//         System.out.println(search_infinite(arr, key));
	}

}
