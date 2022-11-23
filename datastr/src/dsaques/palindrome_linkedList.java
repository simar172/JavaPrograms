package dsaques;

public class palindrome_linkedList {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
			this.next=null;
		}
	}
	
	public ListNode findmiddle(ListNode head) {
		ListNode hare=head;
		ListNode turtle=head;
		while(hare.next!=null && hare.next.next!=null) {
			hare=hare.next.next;
			turtle=turtle.next.next;
		}
		return turtle;
	}
	public ListNode reverse(ListNode head) {
		ListNode curr=head;
		ListNode prev=null;
		while(curr!=null) {
			ListNode next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	public boolean palin(ListNode head) {
		if(head==null|| head.next==null) {
			return true;
		}
		ListNode middle=findmiddle(head);
		ListNode secondhalfstart=reverse(middle.next);
		ListNode firsthalfstart=head;
		while(secondhalfstart!=null) {
			if(firsthalfstart.val!=secondhalfstart.val) {
				return false;
			}
			firsthalfstart=firsthalfstart.next;
			secondhalfstart=secondhalfstart.next;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
