package datastr;

import java.util.ArrayList;
import java.util.Stack;

public class stack1 {
	class stack{
		int data;
		ArrayList<Integer> list=new ArrayList<>();
		public void push(int data) {
			list.add(data);
		}
		public boolean isEmpty() {
			return list.size()==0;
		}
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.remove(list.size()-1);
			return top;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        while(!s.isEmpty()) {
        	System.out.println(s.peek());
        	s.pop();
        }
        
	}

}
