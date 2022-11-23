package palin;

import java.util.Scanner;

public class trail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
      int res=0;
      int n=s.nextInt();
      for(int i=5;i<n;i=i*5) {
    	  res=res+(n/i);
    	  System.out.println(res);
      }
     
	}

}
