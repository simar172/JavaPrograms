package sorting;

public class quicksort {
	public static int part(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<arr.length;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
	}
    public static void quick(int arr[],int low,int high) {
    	if(low<high) {
    		int pidx=part(arr,low,high);
    		quick(arr,low,pidx-1);
    		quick(arr,pidx+1,high);
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {9,4,7,53,2,24,6,6,42,133};
        quick(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
