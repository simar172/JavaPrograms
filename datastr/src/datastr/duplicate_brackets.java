package datastr;

import java.util.Stack;

public class duplicate_brackets {
	
	static boolean check(String s) {
		Stack<Character> st=new Stack<>();
		char arr[]=s.toCharArray();
		int i=0;
		for(char ch:arr) {
			if(ch==')') {
				char top=st.pop();
				while(top!='(') {
					i++;
					top=st.peek();
					st.pop();
				}
				if(i<1) {
					return true;
				}
			}
			else {
				st.push(ch);
			}
		}return false;
	}
	
	public static void main(String[] args) {
         String st="";
         System.out.println(check(st));
	}
}
