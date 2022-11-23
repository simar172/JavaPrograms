package datastr;

import java.util.HashSet;

public class largest_contigoues_array {

	static int findLength(int arr[]) {
		HashSet<Integer> hs=new HashSet<>();
		int maxlen=0;
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i],max=arr[i];
			hs.add(arr[i]);
			for(int j=i+1;j<arr.length-1;j++) {
			if(hs.contains(arr[j])) {
				break;
			}hs.add(arr[j]);
				min=Math.min(min, arr[j]);
				max=Math.max(max, arr[j]);
				if(max-min==j-i) {
					maxlen=Math.max(maxlen, max-min+1);
				}
			}
		}
		return maxlen;
	}
	
	public static void main(String[] args) {
		int arr[] =  {10, 12, 12, 10, 10, 11, 10};
	       System.out.println("Length of the longest contiguous subarray is " +
	                           findLength(arr));
	}
}
