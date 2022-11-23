package dsaques;

public class RemoveNthNodeFromEndofList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	       if(head.next==null){
	        return null;
	    }
	        int size=0;
	       ListNode currnode=head;
	        while(currnode!=null){
	            currnode=currnode.next;
	            size++;
	        }
	    
	    if(n==size){
	        return head.next;
	    }
	    
	    int indextosearch=size-n;
	    ListNode prev=head;
	    int i=1;
	    while(i!=indextosearch){
	        prev=prev.next;
	        i++;
	    }
	    prev.next=prev.next.next;
	    return head;
	}}
}
