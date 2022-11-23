package datastr;

import java.util.*;

public class Hashset_questions {
      static int distinct_elements(int arr[]) {
    	  Set<Integer> a=new HashSet<>();
    	  for(int b:arr) {
    		  a.add(b);
    	  }
		return a.size();
      }
     static int union(int a[],int b[]) {
    	 Set<Integer> set=new HashSet<>();
    	 for(int x:a) {
    		 set.add(x);
    	 }
    	 for(int x:b) {
    		 set.add(x);
    	 }
    	 return set.size();
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {5,10,15,5,10};
          int b[]= {15,10,4};
          System.out.println(distinct_elements(a));
          System.out.println(union(a,b));
	}

}
