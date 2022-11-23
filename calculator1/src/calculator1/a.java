package calculator1;

public class a {

	   public static boolean isPrime(int n) {
		   if(n==1 || n==0) {
			   return false;
		   }
		   if(n==2) {
			   return true;
		   }
		   for(int i=2;i<n;i++) {
			   if(n%i==0) {
				   return false;
			   }
		   }
		   return true;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(isPrime(20));
	}

}
