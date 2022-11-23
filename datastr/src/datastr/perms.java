package datastr;

import java.util.Arrays;
import java.util.Collections;

public class perms {
	 static void reverse(int a[], int n)
	    {
	        int[] b = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	            b[j - 1] = a[i];
	            j = j - 1;
	        }
	        }
	
	public static void perm(int arr[]) {
		int idx=-1;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]>arr[i-1]) {
				idx=i;
				break;
			}
		}
		if(idx==-1) {
			reverse(arr,arr.length);
		}
		else {
			int prev=idx;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
