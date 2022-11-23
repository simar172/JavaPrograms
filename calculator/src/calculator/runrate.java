package calculator;
import java.util.Scanner;
public class runrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		System.out.println("addition,subtraction,multiplication,divide (for addition press + , press - for subtraction,press * for multiplication,press / for divide )");
		float addition=sc.nextFloat();
		if(addition==1) {
		System.out.println("enter first number");
		float a=sc.nextFloat();
		System.out.println("enter second number");
		float  c=sc.nextFloat();
		float b=(a+c);
		System.out.println("for addition" +b);
		}
	else if(addition==2){
		System.out.println("for subtraction");
		System.out.println("enter first number");
			float a=sc.nextFloat();
			System.out.println("enter second number");
			float c=sc.nextFloat();
			float b=a-c;
			System.out.println("for subtraction is" +b);
		}
	else if(addition==3){
		System.out.println("for multiplication");
		System.out.println("enter first number");
			float a=sc.nextFloat();
			System.out.println("enter second number");
			float c=sc.nextFloat();
			float b=a*c;
			System.out.println("for multiplication is" +b);
		}
	else if(addition==4){
		System.out.println("for divide");
		System.out.println("enter first number");
			float a=sc.nextFloat();
			System.out.println("enter second number");
			float c=sc.nextFloat();
			float b=a/c;
			System.out.println("for division is" +b);
		}
	else {
		System.out.println("wrong");
	}
	}

}
