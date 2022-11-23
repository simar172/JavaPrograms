package palin;

import java.util.ArrayList;
import java.util.Collections;

public class chocolate_distributio {
	
        // your code hereCo
		public static long findMinDiff (ArrayList<Long> a, long n, long m)
	    {
	        // your code hereCo
	       Collections.sort(a);
	       long e[]=new long[a.size()];
	       for(long i=0;i<a.size();i++) {
	    	   e[(int) i]=a.get((int) i);
	       }
	       long min=Integer.MAX_VALUE;
	       for(int j=0;j<n-m;j++) {
	    	   if(e[(int) (m-1+j)]-e[j]<min) {
	    		   min=e[(int) (m-1+j)]-e[j];
	    	   }
	       }return min;
	    }
    
	public static void main(String[] args) {
		ArrayList<Long> a=new ArrayList<Long>();
		long b[]= {3, 4 ,1, 9 ,56 ,7 ,9 ,12};
		for(int i=0;i<b.length;i++) {
			a.add(b[i]);
		}
		
		System.out.println(findMinDiff(a, a.size(), 5));
	}

}
