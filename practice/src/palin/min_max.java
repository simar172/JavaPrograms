package palin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class min_max {

	
		Scanner s=new Scanner(System.in);
//		ArrayList<Integer> arr=new ArrayList<>();
//		arr.add(null)
		// TODO Auto-generated method stub
		public static void main(String args[]) {
			 Scanner s=new Scanner(System.in);
			 int a=s.nextInt();
			 String[] arr=new String[a];
		        for(int i=0;i<a;i++){
		               arr[i]=s.next();
		               }
		       
				
		        Arrays.sort(arr);
		        System.out.println(arr);

		   }

}
