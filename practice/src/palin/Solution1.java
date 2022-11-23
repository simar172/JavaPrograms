package palin;



 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution1 {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode turtle=head;
        ListNode hare=head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                return true;
            }
            
        }
        return false;
    }
    
    public static void main(String[] args) {
    	ListNode a1=new ListNode(2);
    	Solution1 a2=new Solution1();
    	System.out.println(a2.hasCycle(a1));
	}
    
}
