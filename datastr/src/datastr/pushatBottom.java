package datastr;

import java.util.Stack;

public class pushatBottom {
      public static void pushatbottom(int data,Stack<Integer> s) {
    	  if(s.isEmpty()) {
    		  s.push(data);
    		  return;
    	  }
    	  int top=s.pop();
    	  pushatbottom(data,s);
    	  s.push(top);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		pushatbottom(60,s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
