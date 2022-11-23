package palin;

import java.util.Scanner;
class myCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    static double power(int n,int p) throws Exception {
    	if(n<1 && p<1) {
    		System.out.println("n and p should not be negative.");
    	}
    	else if(n==0 && p==0){
    		System.out.println("n and p should not be zero.");
    	}
    	else {
    	return Math.pow(n, p);
    	}
		return 0;
    }
}

public class sol2 {
    public static final myCalculator my_calculator = new myCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
            	if(n==0 && p==0) {
                System.out.println("no");}
            }
        }
    }
}
