package factorial;
import java.util.Scanner; 
public class program1 {
      static int a(int n) {
    	  if(n<=1) {
    		  return 1;
    	  }
    	 int b= a(n-1);
    	 int c=(n-1)*a(n-2);
    	System.out.println(c);
    	 System.out.println(b);
 
    	return b+c;
    	 

      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a(4));
	}}
