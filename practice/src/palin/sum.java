package palin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class sum {
   public static void plusminus(int arr[]) {
	   double count=0;
	   double ct=0;
	   double c=0;
	   for(int i=0;i<arr.length;i++)  {
			   if(arr[i]<0) {
				   count++;
			   }
			   else if(arr[i]==0) {
				   ct++;
			   }
			   else {
				   c++;
			   }
		   }
//	   DecimalFormat df= new DecimalFormat("#.000");
	   
	   System.out.println(count/arr.length);
	   System.out.println(ct/arr.length); 
	   System.out.println(c/arr.length);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=s.nextInt();
        }
        plusminus(arr);
	}

}
