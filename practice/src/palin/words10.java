package palin;

import java.util.Scanner;

public class words10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       
        String s=sc.nextLine();
        
        String s1[]=s.split("['!?,._@ ]+");
        
        System.out.println(s1.length);
        for(String a:s1) {
        	
        	
        	System.out.println(a);
        	
        }
        
	}

}
