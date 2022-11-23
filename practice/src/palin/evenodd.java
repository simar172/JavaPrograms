package palin;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enetr number");
        int n=s.nextInt();
        if((n%2==0) && (n>=2 && n<=5)) {
        	System.out.println("not weird");
        }
        else if(n%2!=0){
        	System.out.println("weird");
        }
        else if((n%2==0) && (n>=6 && n<=20)) {
        	System.out.println("weird");
        }
        else if((n%2==0) && (n>20)) {
        	System.out.println("not weird");
        }
        else {
        	System.out.println("not weird");
        }
	}

}
