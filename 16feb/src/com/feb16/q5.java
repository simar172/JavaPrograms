package com.feb16;

public class q5 {
       static class A{
    	   int i;
    	   A(int i){
    		   this.i=i;
    	   }
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a1=new A(5);
         System.out.println(a1.i);
         A a2=new A(10);
         System.out.println(a2.i);
         A a3=new A(15);
         System.out.println(a3.i);
         System.out.println("the array is");
         A a11[]= {a1,a2,a3,new A(20)};
         for(int k=0;k<a11.length;k++){
        	 System.out.println(a11[k].i);
         }

         
			}
	
}
