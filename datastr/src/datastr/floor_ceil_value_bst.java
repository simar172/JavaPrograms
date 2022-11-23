package datastr;
 class Node1{
	 int data;
	 Node1 right;
	 Node1 left;
	 Node1(int data){
		 this.data=data;
		 this.right=null;
		 this.left=null;
	 }
 }
class floor_ceil_value_bst {  
	static Node1 root;
     static int floor(Node1 root,int key) {
    	 int ans=Integer.MAX_VALUE;
    	 while(root!=null) {
    		 if(root.data==key) {
    			 return root.data;
    		 }
    		 else if(root.data>key) {
    			 root=root.left;
    		 }
    		 else {
    			 ans=root.data;
    			 root=root.right;
    		 }
    	 }
		return ans;
     }
     public static int ceil(Node1 root,int key) {
    	 int ans=Integer.MIN_VALUE;
    	 while(root!=null) {
    		 if(root.data==key) {
    			 return root.data;
    		 }
    		 else if(root.data>key) {
    			 ans=root.data;
    			 root=root.left;
    		 }
    		 else {
    			 root=root.right;
    		 }
    	 }
		return ans;
     }
    public static void main(String[] args)  
    {
    	floor_ceil_value_bst a=new floor_ceil_value_bst();
    	a.root=new Node1(8);
    	a.root.left=new Node1(4);
    	a.root.right=new Node1(12);
    	a.root.left.left=new Node1(2);
    	a.root.left.right=new Node1(6);
    	a.root.right.left=new Node1(10);
    	a.root.right.right=new Node1(14);
    	System.out.println(floor(root, 3));
    	System.out.println(ceil(root, 3));
} 
    } 
  
