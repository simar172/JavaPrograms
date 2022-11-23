package parcel;
import java.util.*;
public class pack {
	
	static void accept() {
		System.out.println("Your order is accepted");
	}
	static void calc(String name,int weight) {
		int cst=1;
	       if(weight<=10) {
	    	   cst=(cst+weight*25)+12;
	    	   cst=cst+cst*5/100;
	       }

	       else if(weight>10 || weight<=30) {
	    	   cst=weight*20;
	    	   cst=cst+(cst*5/100);
	       }
	       else {
	    	   cst=weight*10;
	    	   cst=cst+cst*5/100;
	       }
	       
	       print(name,weight,cst);
	}
	static void print(String name,int weight,int cst) {
		System.out.println("Name "+name + " Weight "+ weight+" Cost "+cst );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String name=s.next();
		int weight=s.nextInt();
		accept();
		calc(name, weight);
		
	}

}
