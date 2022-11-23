package datastr;

import java.util.Stack;

public class reversestack {
       public static void pushatbottom(int data,Stack<Integer> s) {
    	   if(s.isEmpty()) {
    		   s.push(data);
    		   return;
    	   }
    	   int top=s.pop();
    	   pushatbottom(data,s);
    	   s.push(top);
       }
       public static void reverse(Stack<Integer> s) {
    	   if(s.isEmpty()) {
    		   return;
    	   }
    	   int top=s.pop();
    	   reverse(s);
    	   pushatbottom(top,s);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack s=new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        
        reverse(s);
//        pushatbottom(60,s);
        while(!s.isEmpty()) {
        	System.out.println(s.pop());
        }
	}

}
