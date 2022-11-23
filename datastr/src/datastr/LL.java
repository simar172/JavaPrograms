package datastr;
//linkedlist ke backend pe kya hota hai ye btaya gya hai
public class LL {
	Node head;
     class Node{
    	 String data;
    	 Node next;
    	 Node(String data){
    		 this.data=data;
    		 this.next=null;
    	 }
    	 
     }
     public void addFirst(String data) {
    	 Node newnode=new Node(data);
    	 if(head==null) {
    		 head=newnode;
    		 return;
    	 }
    	 newnode.next=head;
    	 head=newnode;
     }
     public void addLast(String data) {
    	 Node newnode=new Node(data);
    	 if(head==null) {
    		 head=newnode;
    		 return;
    	 }
    	Node currnode=head;
    	while(currnode.next!=null) {
    		currnode=currnode.next;
    	}
    	currnode.next=newnode;
    	 
     }
     public void DeleteFirst() {
    	 if(head==null) {
    		 System.out.println("empty");
    		 return;
    	 }
    	 head=head.next;
     }
     public void DeleteLast() {
    	 
    	 if(head==null) {
    		 System.out.println("emptylist");
    		 return;
    	 }
    	 if(head.next==null) {
    		 head=null;
    		 return;
    	 }
    	 Node lastnode=head.next;
    	 Node secondlastnode=head;
    	 while(lastnode.next !=null) {
    		 lastnode=lastnode.next;
    		 secondlastnode=secondlastnode.next;
    	 }
    	 secondlastnode.next=null;
     }
     
     public void printList() {
    	 if(head==null) {
    		 System.out.println("empty");
    		 return;
    	 }
    	 Node currnode=head;
    	 while(currnode!=null) {
    		 System.out.print(currnode.data+"-->");
    		 currnode=currnode.next;
    	 }
    	 System.out.println("null");
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LL list=new LL();
        list.addFirst("simar");
        list.addFirst("is");     
        list.addLast("tatti");
        list.printList();
        list.DeleteFirst();
        list.DeleteLast();
        list.printList();
        
        
	}

}
