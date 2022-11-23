package datastr;
class point{
	int data;
	point left, right;
	point(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}

public class bst_from_preorder {
	static point node;
	static	point createnode(point root,int data) {
		if(root==null) {
			return new point(data);
		}
		if(root.data>data) {
			root.left=createnode(root.left,data);
		}
		 if(root.data<data) {
			root.right=createnode(root.right,data);
		}return root;
	}
	static void create(int data) {
		node=createnode(node,data);
	}

	static void inorder(point root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]={ 10, 5, 1, 7, 40, 50 };
         
         for(int i=0;i<arr.length;i++) {
        	 create(arr[i]);
         }
		inorder(node);
		
	}

}
