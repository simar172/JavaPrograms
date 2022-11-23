package dsaques;



public class Listnode {
	Node head;
	Listnode next;
	private String data;
	static int size=0;
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

	public void printList() {
   	 if(head==null) {
   		 System.out.println("empty");
   		 return;
   	 }
   	 Node currnode=head;
   	 while(currnode!=null) {
   		 System.out.print(currnode.data+"-->");
   		 currnode=(Node) currnode.next;
   	 }
   	 System.out.println("null");
//   	 System.out.println(size);
    }	
	
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listnode list=new Listnode();
		list.addFirst("simar");
		list.addFirst("simara");
		list.addFirst("simaraaa");
		
		list.printList();
		
		
	}

}
