package palin;

public class plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double palin=1002;
     double reverse=palin/10;
     double num=reverse*10;
     if(palin==num) {
    	 System.out.println("palindrome");
     }
     else {
    	 System.out.println("not a plaindrome");
     }
     System.out.println(reverse);
     System.out.println(num);
	}

}

