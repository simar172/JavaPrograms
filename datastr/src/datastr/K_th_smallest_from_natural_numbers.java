package datastr;

public class K_th_smallest_from_natural_numbers {
	
	public static int ksmallest(int arr[],int n,int k) {
		int newar[]=new int[1000000];
	    for(int i=0;i<arr.length;i++) {
	    	newar[i]=1;
	    }	
	    
	    for(int j=1;j<Integer.MAX_VALUE;j++) {
	    	if(newar[j]!=1) {
	    		k--;
	    	}
	    	if(k!=1) {
	    		return j;
	    	}
	    }
		return 1000000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
        int arr[] = { 1 };
        int n = arr.length;
        System.out.println(ksmallest(arr, n, k));
	}

}
