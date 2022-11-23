package datastr;

import java.util.Queue;
import java.util.Stack;

public class queue_using_stack {
	static Stack<Integer> s=new Stack<>();
	static Stack<Integer> w=new Stack<>();
	static void push1(int data) {
		s.push(data);
	}
	public static int pop1() {
		while(!s.isEmpty()) {
			w.push(s.pop());
		}
		Object ans=  w.pop();
		while(!w.isEmpty()) {
			s.push(w.pop());
		}
		return (int) ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        push1(10);
        push1(20);
        push1(30);
        System.out.println(pop1());
        System.out.println(pop1());
	}

}
