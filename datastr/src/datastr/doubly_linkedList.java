package datastr;

import datastr.doubly_linkedList.doublyNode;

class doubly{
	public doublyNode head;
	public doublyNode tail;
	public int size;
	public doublyNode doubley(int val) {
		head=new doublyNode();
		doublyNode newnode=new doublyNode();
		newnode.value=val;
	    newnode.next=null;
	    newnode.prev=null;
		head=newnode;
		tail=newnode;
		size=1;
		return head;
	}
	
	public void atdiff(int val,int location) {
		doublyNode newnode=new doublyNode();
		newnode.value=val;
		if(head==null) {
			doubley(val);
			return;
		}
		else if(location==0) {
			newnode.prev=null;
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
			
		}
		else if(location>=size) {
			newnode.next=null;
            tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
		else{
			doublyNode tempnode=head;
			int index=0;
			while(index<location-1) {
				tempnode=tempnode.next;
				index++;
			}
			newnode.prev=tempnode;
			newnode.next=tempnode.next;
			tempnode.next=newnode;
			tempnode.next.prev=newnode;
		}size++;
	}
	
	public void reverse() {
		if(head!=null) {
		doublyNode tempnode=tail;
		for(int i=0;i<size;i++) {
			System.out.print(tempnode.value);
			if(i!=size-1) {System.out.print("<- ");}
			tempnode=tempnode.prev;
		}
		
	}else{
		System.out.println("not exist");
	}
		}
	
	public void delete(int location) {
		if(head==null) {
			return;
		}
		else if(location==0) {
			if(size==1) {
				head=null;
				tail=null;
				size--;
				return;
			}
			else {
				head=head.next;			
				head.prev=null;
				size--;
			}
			
				}
		
		else if(location>=size) {
			if(size==1) {
				head=null;
				tail=null;
				size--;
				return;
			}
			else {
				tail.prev.next=null;
				tail=tail.prev;
				size--;
			}
		}
		else {
			doublyNode tempnode=head;
			for(int i=0;i<location-1;i++) {
				tempnode=tempnode.next;
			}
			tempnode.next=tempnode.next.next;
			tempnode.next.prev=tempnode;
			size--;
		}
	}
	
	public void delete() {
		doublyNode tempnode=head;
		for(int i=0;i<size;i++) {
			tempnode.prev=null;
			tempnode=tempnode.next;
		}
		head=null;
		tail=null;
		System.out.println("deleted");
	}
	
}
public class doubly_linkedList {
	static class doublyNode{
		public int value;
		public doublyNode next;
		public doublyNode prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        doubly a=new doubly();
//        a.doubley(4);
        a.atdiff(1, 0);
        a.atdiff(2, 1);
        a.atdiff(3, 2);
        a.atdiff(4, 3);
        a.delete(2);
        a.delete();
//        a.reverse();
//        System.out.println(a.head.next.prev.value);
//        System.out.println(a.head.value);
	} 

}
