package palin;

public class miss {
	 static int a[]= {1,2,3,4,5,1,12,8,3,4,5,6,7,5,3,4,5,7,9};
     static int sum=10;
     static int i;
     static int j;
     
 public static int test1() {
	 for(i=0;i<a.length;i++) {
  	   for( j=1;j<a.length;j++) {
  		   if(a[i]+a[j]==sum) {
  			
  			System.out.println("first element in arrya is "+a[i]);
  			
  			System.out.println("second element in array is "+a[j]);
  			System.out.println(" "); 
  	  		 
  		   }
  	   }
     }
	return 0;
	 
	
 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test1();
           
          
	}
}