package palin;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sol3 {
	static  Scanner s= new Scanner(System.in);
	 static boolean flag=true;
	 static int B=s.nextInt();
     static int H=s.nextInt();
       static {
         
        
        if(H<0 || B<0) {
        	flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        
        }
        
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

