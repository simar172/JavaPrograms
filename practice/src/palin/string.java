package palin;

import java.math.BigInteger;

public class string {
public static String multiply(String num1, String num2) {
        long  a=Long.parseLong(num1);
        long b=Long.parseLong(num2);
        long c=a*b;
        String d=c+"";
        return d;
    }
public  String multiply1(String num1, String num2) {
	BigInteger a=new BigInteger(num1);
	BigInteger b=new BigInteger(num2);
	return a.multiply(b).toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "498828660196", num2 = "840477629533";
		System.out.println(multiply1(num1, num2));
	}

}
