 package datastr;

public class Bookallocation_binarysearch {
	public static int largest(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static boolean isFeasible(int arr[],int key,int res) {
	    
		int sum=0;
		int student=1;
		for(int i=0;i<arr.length;i++) {
			if(sum+arr[i]>res) {
				student++;
				sum=arr[i];
			}
			else {
				sum+=arr[i];
			}
		}
		return student<=key;
	}
	public static int books(int arr[],int key) {
		int low=largest(arr);
		int high=sum(arr);
		int res=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(isFeasible(arr,key,mid)) {
				res=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {10,10,20,30};
        System.out.println(books(arr, 2));
	}

}
