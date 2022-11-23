package datastr;

import java.util.Stack;

public class parenthesis_matching_stack {
	public static boolean isopening(char b) {
		return b=='(' || b=='{' || b=='[';
	}
	public static boolean ismatching(char a,char b) {
		return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
	}
	public static boolean parenthisis(String a) {
		Stack<Character> c=new Stack<>();
	for(int i=0;i<a.length();i++) {
		char b=a.charAt(i);
	    if(isopening(b)) {
			c.push(b);
		}
	    else {
	    	if(c.isEmpty()) {
	    		return false;
	    	}
	    	else if(ismatching(c.peek(),b)) {
	    		c.pop();	    	
	    		}else {return false;}
	    }
	   
		
		
	}
	 return c.isEmpty();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="(])";
        System.out.println(parenthisis(a));
        
	}

}
