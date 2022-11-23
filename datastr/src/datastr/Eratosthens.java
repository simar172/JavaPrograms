package datastr;

import java.util.Arrays;

public class Eratosthens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         boolean isprime[]=a(100);
         for(int i=0;i<=100;i++) {
        	 System.out.println(i+" "+isprime[i]);
         }
	}
	static boolean[] a(int n) {
		
		boolean isprime[]=new boolean[n+1];
		Arrays.fill(isprime,true);
		isprime[0]=false;
		isprime[1]=false;
		for(int i=2;i*i<=n;i++) {
			for(int j=2*i;j<=n;j+=i) {
				isprime[j]=false;
				
			}
		}
		return isprime;
	}

}
