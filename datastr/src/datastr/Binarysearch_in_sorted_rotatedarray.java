  package datastr;

public class Binarysearch_in_sorted_rotatedarray {
	public static int bin(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==key ) {
				return mid;
			}
			if(arr[mid]>arr[low]) {
				if(key>arr[low] && key<arr[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if(key>arr[mid] && key<arr[high]) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
		}
		return -1;
	}
            public static void main(String[] args) { 
	         int arr[]= {4,5,6,7,0,1,2};
	         int key=8;
	         System.out.println(bin(arr, key));
}
}
