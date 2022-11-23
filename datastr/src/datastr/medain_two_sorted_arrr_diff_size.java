package datastr;
import java.util.*;
public class medain_two_sorted_arrr_diff_size {
	static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
		Collections.reverse(Arrays.asList(a));
		Arrays.toString(a);
		Arrays.sort(b);
		if(n==m) {
			return (a[0]+b[0])/2;
		}
		return a[0];
    }
	

           public static void main(String[] args) {
        	   int a[]={1,5,9};
        	   int b[] = {2,3,6,7};
		}
}
