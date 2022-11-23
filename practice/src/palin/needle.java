package palin;

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
	     int val;
	      ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
public class needle {
//	 public static int strStr(String haystack, String needle) {
//	        return haystack.indexOf(needle);
//	    }
	
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	       ListNode head=list1;
	       ListNode temp=null;
	       while(list1!=null) {
	    	   temp=list1;
	    	   list1=list1.next;
	       }
	       list1.next=list2;
	       ArrayList<ListNode> a=new ArrayList();
	       a.add(head);
	       
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         String hay="hello";
//         String needle="ll";
//         System.out.println(strStr(hay, needle));
	}

}
