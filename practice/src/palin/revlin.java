package palin;

import java.util.LinkedList;

class Node{
	Node next;
	Node prev;
	String data;
	Node head;
	public void add(String data) {
		Node b=new Node();
           
           b.next=head;
           head=b;
           
           return;
         
	}
}
public class revlin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList c=new LinkedList();
        c.add("1");
        c.add("2");
//        d.a("1");
        System.out.println(c);
	}

}
