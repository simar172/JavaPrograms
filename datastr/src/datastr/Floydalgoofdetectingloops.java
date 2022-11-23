package datastr;

import java.util.LinkedList;

import datastr.LL.Node;

//import dsaques.RemoveNthNodeFromEndofList.ListNode;

public class Floydalgoofdetectingloops {
	static ListNode head;
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {
	    	  
	      }
	      ListNode(int val){
	       this.val = val;
	      }
	      ListNode(int val, ListNode next) { 
	    	  this.val = val; 
	    	  this.next = next; 
	    	  }
	  }
	public void addFirst(Integer data) {
   	 ListNode newnode=new ListNode(data);
   	 if(head==null) {
   		 head=newnode;
   		 return;
   	 }
   	 newnode.next=head;
   	 head=newnode;
    }
	static void removeLoop(ListNode fast, ListNode slow)
    {
        ListNode ptr1 = fast;
        ListNode ptr2 = fast;
        int k = 1, i;
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }
        ptr1 = slow;
        ptr2 = slow;
        for (i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }
        
        while (ptr2 != ptr1) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }
        ptr2.next = null;
    }
	
	

	public static ListNode hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
		slow = slow.next;
		fast = fast.next.next;
		if(fast == slow) {
			
		return slow;
		}
		}
		return null;
		
}
	public static ListNode cycle_kahan_par_hai(ListNode head) {
		ListNode meet=hasCycle(head);
		ListNode start=head;
		while(start!=meet) {
			start=start.next;
			meet=meet.next;
		}
		return start;
	}
	
	public void printList(ListNode head) {
   	 if(head==null) {
   		 System.out.println("empty");
   		 return;
   	 }
   	 ListNode currnode=head;
   	 while(currnode!=null) {
   		 System.out.print(currnode.val+"-->");
   		 currnode=currnode.next;
   	 }
   	 System.out.println("null");
    }
	
	
	
	public static void main(String[] args) {
		Floydalgoofdetectingloops a1=new Floydalgoofdetectingloops(); 
//		 ListNode<Integer> l1 = new ListNode<Integer>();
		 a1.addFirst(1);
		a1.addFirst(2);
		a1.addFirst(13);
		a1.addFirst(4);
//		a1.addFirst(5);
		a1.head.next.next.next.next = a1.head;
		a1.hasCycle(a1.head);
         a1.printList(head);
		System.out.println("=============");
		a1.printList(head);
	}
}
