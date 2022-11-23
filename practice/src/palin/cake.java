package palin;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class cake {
	    public static void main(String[] args)  {
	        Scanner s=new Scanner(System.in);
	         int a=s.nextInt();
	         Double b[]=new Double[a];
	         for(double i=0;i<b.length;i++){
	             b[(int) i]=s.nextDouble();
	         }
	         Arrays.sort(b,Collections.reverseOrder());
	         long c=0;
	         for(double i=0;i<b.length;i++){
	             c=(long) (c+Math.pow(2, i)*b[(int) i]);
	     
	}
	         System.out.println(c);
	}
}
