package datastr;

public class Point_to_next_higher_value_node_arbitrary_pointer {
	    static Nod1 head;
	 
	    /* Link list node */
	    static class Nod1	    {
	        int data;
	        Nod1 next, arbit;
	 
	        Nod1(int data)
	        {
	            this.data = data;
	            next = null;
	            arbit = null;
	        }
	    }
	 
	    // Utility function to print result linked list
	    void printList(Nod1 node, Nod1 anode)
	    {
	        System.out.println("Traversal using Next Pointer");
	        while (node != null)
	        {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	 
	        System.out.println("\nTraversal using Arbit Pointer");
	        while (anode != null)
	        {
	            System.out.print(anode.data + " ");
	            anode = anode.arbit;
	        }
	    }
	 
	    Nod1 random(Nod1 start) {
	    	Nod1 temp=start;
	    	while(temp!=null) {
	    		temp.arbit=temp.next;
	    		temp=temp.next;
	    	}
	    	return merge(start);
	    }

	private Nod1 merge(Nod1 start) {
			// TODO Auto-generated method stub
			if(start==null || start.arbit==null) {
				return start;
			}
			Nod1 mid=getmid(start);
			Nod1 nextmid=mid.arbit;
			mid.arbit=null;
			Nod1 left =merge(start);
			Nod1 right=merge(nextmid);
			Nod1 sort=sort(left,right);
			return sort;
			
			
		}

	private Nod1 sort(Nod1 a, Nod1 b) {
		// TODO Auto-generated method stub
		Nod1 result=null;
		if(a==null) {
			return b;
		}
		else if(b==null) {
			return a;
		}
	
		if(a.data<=b.data) {
			result=a;
			result.arbit=sort(a.arbit,b);
		}
		else {
			result=b;
			result.arbit=sort(a,b.arbit);
		}
		return result;
		
	}

	private Nod1 getmid(Nod1 start) {
		// TODO Auto-generated method stub
	     if(start==null ) {
	    	 return start;
	     }
	     Nod1 fast=start.arbit;
	     Nod1 slow=start;
	     while(fast!=null) {
	    	 fast=fast.arbit;
	    	 if(fast!=null) {
	    		 fast=fast.arbit;
	    		 slow=slow.arbit;
	    	 }
	     }
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point_to_next_higher_value_node_arbitrary_pointer list = new Point_to_next_higher_value_node_arbitrary_pointer();
		 
        /* Let us create the list shown above */
        list.head = new Nod1(5);
        list.head.next = new Nod1(10);
        list.head.next.next = new Nod1(2);
        list.head.next.next.next = new Nod1(3);
 
        /* Sort the above created Linked List */
        Nod1 ahead = list.random(head);
 
        System.out.println("Result Linked List is:");
        list.printList(head, ahead);
	}

}
