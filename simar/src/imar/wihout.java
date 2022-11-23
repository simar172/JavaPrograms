package imar;

import java.util.*;

public class wihout {
	 public static ArrayList<Integer> duplicates(int arr[], int n) {
	        // code here
	        HashSet<Integer> a=new HashSet<>();
	        HashSet<Integer> b=new HashSet<>();
	        ArrayList<Integer> c=new ArrayList<Integer>();
	        for(int i=0;i<arr.length;i++){
	            if(a.contains(arr[i])){
	                b.add(arr[i]);
	            }
	            
	            else{
	                a.add(arr[i]);
	            }
	        }
	        c.addAll(b);
	        if(b.isEmpty()) {
	        	b.add(-1);
	        	c.addAll(b);
	        	Collections.sort(c);
	        	return c;
	        }
	        Collections.sort(c);
	        return c;
	    }

	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		System.out.println(duplicates(arr, arr.length));
	}
	}