package recur;

public class sortedorunsorted {
       static boolean p(int a[],int idx) {
    	   if(idx==a.length-1) {
    		   return true;
    	   }
    	   if(a[idx]<a[idx+1]) {
    		   return p(a,idx+1);
    	   }
    	   else {
    		   return false;
    	   }
    	   
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {1,2,8,3};
         System.out.println(p(a,0));
	}

}
