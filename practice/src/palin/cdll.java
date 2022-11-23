package palin;

import palin.cdll.Noode;

class cdl{
	public Noode head;
	public Noode tail;
	public int size;
	public Noode circular(int val) {
		head=new Noode();
		Noode newnode=new Noode();
		newnode.value=val;
		head=newnode;
		tail=newnode;
		newnode.next=newnode;
		newnode.prev=newnode;
		size=1;
		return head;
	}
	
	public void atdiff(int val,int location) {
		Noode newnode=new Noode();
		newnode.value=val;
		if(location==0) {
			circular(val);
			return;
		}
		else if(location>=size) {
			newnode.prev=tail;
			newnode.next=null;
			tail.next=newnode;
			head.prev=newnode;
			tail=newnode;
		}
		else {
			Noode tempnode=new Noode();
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
}
public class cdll {
    static class Noode{
    	public Noode next;
    	public Noode prev;
    	public int value;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular a=new circular();
		a.atdiff(0, 0);
		a.atdiff(1, 1);
		a.atdiff(2, 2);
		a.atdiff(3, 3);
		System.out.println(a.head.next.value);
	}

}
