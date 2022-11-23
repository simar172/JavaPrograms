package datastr;

import java.util.*;

public class union {
	
	void ceil(float a[]) {
//		Arrays.sort(a);
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
		      
		}
	}
	

	static void union(int a[], int b[]) {
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			arr.add(b[i]);
		}
		
		int ans[]=new int[arr.size()];
		for(int i=0;i<ans.length;i++) {
			ans[i]=arr.get(i);
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(" "+ans[i]);
		}
	}

	public static void main(String[] args) {
       int a[]= {2,3,1,6};
       int b[]= {7,6,5,8};
       union(a, b);
      
	}
}
