package datastr;

import datastr.LL.Node;

public class queue {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
static class n{
	static Node head;
		static Node rear;
		static Node front;
	public static void enque(int data) {
		Node newnode=new Node(data);
		if(front==null) {
			front=rear=newnode;
			return;
		}
		rear.next=newnode;
		rear=newnode;
		
	}
	public static int deque(int data) throws Exception {
		if(front==null) {
			throw new Exception("-1");
		
		}
		int result=front.data;
		front=front.next;
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        n a=new n();
        a.enque(4);
        a.enque(5);
        
        
	}}}


