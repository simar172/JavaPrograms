package datastr;

import java.util.Stack;

public class count_naturalnumber_permiutaions_greater__than_given_number {

	
	static int great(int n) {
		int result=0;
		Stack<Integer> st=new Stack<>();
		for(int i=1;i<=9;i++) {
			
			st.push(i);
			result++;
		}
		
		while(!st.isEmpty()) {
			int top=st.pop();
		     for(int i=top%10;i<=9;i++) {
		    	 int x=top*10+i;
		    	 if(x<=n) {
		    		 st.push(x);
		    		 result++;
		    	 }
		     }	
		}
		return result;
		
	}
	
	public static void main(String[] args) {
      System.out.println(great(15));
	}
}
