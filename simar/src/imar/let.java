package imar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class let {

public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
        	a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++) {
        	a.add(nums2[i]);
        }
        Collections.sort(a);

          for(int i=0;i<a.size();i++) {
        	  for(int j=i+1;j<a.size();j++) {
        	  if (a.get(i)==0 ) {
        		  a.remove(i);
        	  }}
          }System.out.println(a);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1,2,2,3,5,6]
        int arr[]= {1,2,3,0,0,0};
        int arr1[]= {2,5,6};
        merge(arr, 0, arr1, 0);
	}

}
