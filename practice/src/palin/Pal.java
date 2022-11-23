package palin;

public class Pal {

	public static void main(String[] args) {

		int pain=-1234;
		 int num= 0;
		 int palin= pain;
		 for (int i=0;i<4;i++)
	     {
			 int reverse=palin%10;
			 num= num*10 + reverse;
			 palin= palin/10;
			 
	     }
//	     if(pain==num) {
//	    	 System.out.println("palindrome");
//	     }
//	     else {
//	    	 System.out.println("not a plaindrome");
//	     }
//	     System.out.println(palin);
	     System.out.println(num);	

	}

}
