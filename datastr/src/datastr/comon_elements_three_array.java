package datastr;
import java.util.*;
public class comon_elements_three_array {
	static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
	    {
	        // code here 
	       ArrayList<Integer> a=new ArrayList<>();
	       for(int i=0;i<A.length;i++) {
	    	   a.add(A[i]);
	       }
	       
	       for(int i=0;i<B.length;i++) {
	    	   a.add(B[i]);
	       }
	       
	       for(int i=0;i<C.length;i++) {
	    	   a.add(C[i]);
	       }
	       ArrayList<Integer> an=new ArrayList<>();
	       ArrayList<Integer> ans=new ArrayList<>();
	       HashSet<Integer> ans1=new HashSet<>();
	       for(int i=0;i<a.size();i++) {
	    	 if(an.contains(a.get(i))) {
	    		 ans1.add(a.get(i));
	    	 }
	    	 else {
	    		 an.add(a.get(i));
	    	 }
	       }
	       ans.addAll(ans1);
	       Collections.sort(ans);
	       return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {1, 5, 10, 20, 40, 80};
		int[] B = {6, 7, 20, 80, 100};
		 int []C = {3, 4, 15, 20, 30, 70, 80, 120};
		 System.out.println(commonElements(A, B, C, A.length, B.length, C.length));
		 
	}

}
