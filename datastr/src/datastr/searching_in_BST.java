package datastr;
class Node{
	int data;
	Node root;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
}
public class searching_in_BST {\
	//asli yahan pr hai https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1
	public  boolean search(Node root,int x) {
		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		if(root.data>x) {
			return search(root.left,x); 
		}
		return search(root.right,x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node a=new Node(1);
        searching_in_BST b=new searching_in_BST();
        b.search(a, 5);
	}

}
