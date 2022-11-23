package datastr;

import datastr.circular_linkedlist.Nodey;

//import palin.circular_linkedlist.Nodey;

class circular{
	public Nodey head;
	public Nodey tail;
	public int size;
	public Nodey csll(int val) {
		head=new Nodey();
		Nodey a=new Nodey();
		a.value=val;
		a.next=a;
		head=a;
		tail=a;
		size=1;
		return head;
	}
	
	public void atdiff(int val,int location) {
//		head=new Nodey();
		Nodey a=new Nodey();
		a.value=val;
		if(head==null) {
			csll(val);
			return;
		}
		else if(location==0) {
			a.next=head;
			head=a;
			tail.next=head;
			
		}
		else if(location>=size) {
			tail.next=a;
			tail=a;
			tail.next=head;
		}
		else {
			Nodey tempnode=head;
			int index=0;
			while(index<location-1) {
				tempnode=tempnode.next;
				index++;
			}
			a.next=tempnode.next;
			tempnode.next=a;
		}size++;
	}
	
	public void traversal() {
    	if(head!=null) {
    		Nodey tempnode=head;
    		for(int i=0;i<size;i++) {
    			System.out.print(tempnode.value);
    			if(i!=size-1) {
    				System.out.print("->");
    			}
    			tempnode=tempnode.next;
    		}
    	}
    	else {
    		System.out.println("empty");
    	}
    }
	
	public boolean searching(int value) {
		if(head!=null) {
			Nodey tempnode=head;
			for(int i=0;i<size;i++) {
				if(tempnode.value==value) {
					System.out.println("\nfound at "+i);
					return true;
				}tempnode=tempnode.next;
			}
		}System.out.println("\nnot found");
		return false;
	}
	
	public void deleting(int location) {
		System.out.println("\n");
		if(head==null) {
			return;
		}
		else if(location==0) {
			head=head.next;
			tail.next=head;
			size--;
			if(size==0) {
				head.next=null;
				head=null;
				tail=null;
			}
		}
		else if(location>=size) {
			Nodey tempnode=head;
			for(int i=0;i<size-1;i++) {
				tempnode=tempnode.next;
			}
			if(tempnode==head) {
				head.next=null;
				head=null;
				tail=null;
				size--;	
				return;
			}
			tempnode.next=head;
			tail=tempnode;
		}
		else {
			Nodey tempnode=head;
			for(int i=0;i<location-1;i++) {
				tempnode=tempnode.next;
			}
			tempnode.next=tempnode.next.next;
			size--;
		}
	}
	
	public void deletinglinkedlist() {
		System.out.println();
		if(head==null) {
			System.out.println("doesnot exist");
			return;
		}
		head=null;
		tail.next=null;
		tail=null;
		System.out.println("deleted");
	}
}

public class circular_linkedlist {
    static class Nodey{
    	public Nodey next;
    	public int value;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        circular c=new circular();
        c.atdiff(1, 0);
        c.atdiff(2, 1);
        c.atdiff(3, 2);
        c.atdiff(4, 3);
        c.traversal();
//        c.searching(5);
        c.deleting(3);
        c.traversal();
        c.deletinglinkedlist();
//        c.traversal();
//        System.out.println(c.head.next.value);
	}

}
