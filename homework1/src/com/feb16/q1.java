package com.feb16;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x[]= {2,1,0,7,3,6,5,100};        
        int n=x.length;
        int great=x[0];
        for(int i=1;i<n;i++) {
        	if(great<x[i]) {
        		 great=x[i];
        		
        	}
        }
        System.out.println(great);
        }
}


