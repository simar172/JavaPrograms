package datastr;

public class insert_node_bst {

	class Solution {
	    // Function to insert a node in a BST.
		//insert node ka link https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1#\
		//delete node ka link https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1/#
		//BST hai k nhi https://practice.geeksforgeeks.org/problems/check-for-bst/1/
	    Node insert(Node root, int Key) {
	        // your code here
	        if(root==null){
	            return new Node(Key);
	        }
	        if(root.data>Key){
	            root.left=insert(root.left,Key);
	        }
	        else if(root.data<Key){
	            root.right=insert(root.right,Key);
	        }
	        return root;
	       
	    }
	}

}
