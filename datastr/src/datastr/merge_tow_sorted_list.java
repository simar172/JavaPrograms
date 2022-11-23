package datastr;
class ListNode123 {
	     int val;
	      ListNode123 next;
	      ListNode123() {}
	      ListNode123(int val) { this.val = val; }
	      ListNode123(int val, ListNode123 next) { this.val = val; this.next = next; }
	  }
public class merge_tow_sorted_list {
	public ListNode123 mergeTwoLists(ListNode123 list1, ListNode123 list2) {
	      ListNode123 head=new ListNode123(0);
	        ListNode123 curr=head;
	        while(curr!=null) {
	        	curr=curr.next;
	        }
	        curr.next=list2;
	        while(list2.next!=null) {
	        	list2=list2.next;
	        }
	        return head;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
