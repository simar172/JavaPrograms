package datastr;

import java.util.Arrays;

public class string {
	static boolean compare(String s1,String s2) {
		// smile miles, 1. char Array, 2. sort, compare
		char arr[]= s1.toCharArray();
		char arr1[]=s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(arr.length==arr1.length) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==arr1[i]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
     String s1="smile";
     String s2="miles";
     System.out.println(compare(s1, s2));
	}
}
