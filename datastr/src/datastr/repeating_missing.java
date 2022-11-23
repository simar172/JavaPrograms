package datastr;

import java.util.*;

public class repeating_missing {
	static int[] rep_mis(int A[]) {
		HashSet<Integer> a=new HashSet<Integer>();
		LinkedHashSet<Integer> b=new LinkedHashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			if(a.contains(A[i])){
				b.add(A[i]);
			}
			else {
				a.add(A[i]);
			}
			
		}
		
		 Integer missed = null;
	        for (int i = 0; i < A.length; i++) {
	            int index = i + 1;
	            if (A[i] != index) {
	                missed = index;
	                break;
	            }
	        }
	        b.add(missed);
        ArrayList<Integer> t=new ArrayList<Integer>();
        t.addAll(b);
        int e[]=new int[t.size()];
        for(int i=0;i<t.size();i++) {
        	e[i]=t.get(i);
        }return e;
	}
//	
//	static void printTwoElements(int arr[], int size)
//    {
//        int i;
//        System.out.print("The repeating element is ");
//  
//        for (i = 0; i < size; i++) {
//            int abs_val = Math.abs(arr[i]);
//            if (arr[abs_val - 1] > 0)
//                arr[abs_val - 1] = -arr[abs_val - 1];
//            else
//                System.out.println(abs_val);
//        }
//  
//        System.out.print("And the missing element is ");
//        for (i = 0; i < size; i++) {
//            if (arr[i] > 0)
//                System.out.println(i + 1);
//        }
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= { 7, 3, 4, 5, 5, 6, 2 };
        System.out.println(rep_mis(arr));
//        printTwoElements(arr, arr.length);
	}

}
