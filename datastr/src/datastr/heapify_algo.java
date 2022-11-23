package datastr;

public class heapify_algo {
	
       public static void heapify(int arr[],int n,int i) {
    	   int largest=i;
    	   int left=2*i;
    	   int right=2*i+1;
//    	   System.out.println("lefft"+left);
//    	   System.out.println("right"+right)+-;
    	   if(left<=n && arr[left]>arr[largest]) {
    		   largest=left;
    	   }
    	   
    	   if(right<=n && arr[right]>arr[largest]) {
    		   largest=right;
    	   }
    	   if(largest!=i) {
    		    int temp=arr[i];
    			arr[i]=arr[largest];
    			arr[largest]=temp;
    		   heapify(arr,n,largest);
    	   }
       }
       
       public static void insert(int a[],int n,int value) {
       	n=n+1;
       	a[n]=value;
       	int i=n;
       	while(i>=1) {
       		int parent=i/2;
       		if(a[parent]<a[i]) {
       			int temp=a[i];
       			a[i]=a[parent];
       			a[parent]=temp;
       			i=parent;
       		}
       		else {
       			return;
       		}
       	}
       	for(int j=0;j<=n;j++) {
       		   System.out.println(a[j]);
       	}
       }
       
       public static void buildheap(int arr[],int n) {
    	   for(int i=(n/2);i>=0;i--) {
    		   heapify(arr, n, i);
    	   }
       }
       
       static void printHeap(int arr[], int n) 
       { 
         System.out.println("Array representation of Heap:"); 
         for (int i = 0; i <= n; i++) 
         System.out.print(arr[i] + " "); 
         System.out.println(); 
       } 
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5};
        int n=arr.length-1;
        int i=3;
//        heapify(arr, n, i);
//        System.out.println("========");
        buildheap(arr, n);
        printHeap(arr, n);
        
//        heapsort(arr, n, i);
	}

}
