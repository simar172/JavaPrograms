package com.feb16;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x[]= {1,2,3,4,0,-6,5,-2,-1,-4};
        int less=x[0];
        int n=x.length;
        for(int i=1;i<n;i++) {
        	if(less>x[i]) {
        		less=x[i];
        		System.out.println(less);
        }
        
	}
	}

}
