 package recur;

public class mathodsinmatrix {
       static int a(int i,int j,int m,int n) {
    	   if(i==m || j==n) {
    		   return 0;
    	   }
    	   if(i==m-1 && j==n-1) {
    		   return 1;
    	   }
    
    	   int downpaths=a(i+1,j,m,n);
    	   int rightpaths=a(i,j+1,m,n);
    	  
    	   return downpaths+rightpaths;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int m=2;
         int n=2;
         int total=a(0,0,m,n);
         System.out.println(total);
	}

}
