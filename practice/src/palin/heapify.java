package palin;

public class heapify {
	public static void heap(int arr[],int n,int i) {
		int largest=i;
		int left=2*i;
		int right=2*i+1;
		if(right<=n && arr[right]>largest) {
			largest=right;
		}
		
		if(left<=n && arr[left]>largest) {
			largest=left;
		}
		
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heap(arr,n,largest);
		}
	}
  public static void build(int arr[],int n) {
	  for(int i=n/2;i>=0;i--) {
		  heap(arr,n,i);
	  }
  }
  public static void print(int arr[],int n) {
	  for(int i=0;i<=n;i++) {
		  System.out.print(arr[i]);
		  
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5}; 
        int n=arr.length-1;
        heap(arr, n, 5);
		build(arr, n);
		print(arr, n);
	}

}
