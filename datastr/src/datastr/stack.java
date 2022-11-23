package datastr;

import java.util.Stack;

public class stack {
	   public static Node head;
       public class Node{
    	         int data;
    	         Node next;
	             Node(int data){
		              this.data=data;
		              this.next=null;
	             }
	}
       public static boolean isEmpty() {
    	   return head==null;
       }
       public void push(int data) {
    	   Node newnode=new Node(data);
    	   if(isEmpty()) {
    		   head=newnode;
    		   return ;
    	   }
    	   newnode.next=head;
    	   head=newnode;
       }
       public int pop() {
    	   if(isEmpty()) {
    		   return -1;
    	   }
    	   Node top=head;
    	   head=top.next;
    	   return top.data; 
       }
       public int peek() {
    	   if(isEmpty()) {
    		   return -1;
    	   }
    	   Node top=head;
    	   return top.data;
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while(!s.isEmpty()) {
        	System.out.println(s.peek());
        	s.pop();
        }
	}

}
