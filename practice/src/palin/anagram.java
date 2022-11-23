package palin;

import java.util.*;

public class anagram {

	 static boolean isAnagram(String a, String b) {
	        // Complete the function
		
		char arr1[]=a.toCharArray();			 
	    char arr2[]	=b.toCharArray();
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    if(arr1.length!=arr2.length) {
	    	return false;
	    }
	    int i=0,j=0;
	    while(i<arr1.length && j<arr2.length) {
	    	if(arr1[i]!=arr2[j]) {
	    		return false;
	    	}
	    }return true;
	 }

	    public static void main(String[] args) {
	      String a="rat";
	      String b="car";
	      System.out.println(isAnagram(a, b));
	        }
	}

