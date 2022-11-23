package datastr;

import java.util.LinkedList;
import java.util.Queue;

public class binarytree {
	public static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static int idx=-1;
	public static node buildtree(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		node a2=new node(nodes[idx]);
		a2.left=buildtree(nodes);
		a2.right=buildtree(nodes);
		return a2;
		
	}
	
	public static void preorder(node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void inorder(node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void postorder(node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void levelorder(node root) {
		Queue<node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
	    while(!q.isEmpty()) {
	    	node currnode=q.remove();
	    	if(currnode==null){
	    		System.out.println();
	    	    if(q.isEmpty()) {
	    		     break;
	    	      }
	    	    else {
	    		     q.add(null);
	    	}
	      }
	    	else {
	    		System.out.print(currnode.data);
	    		if(currnode.left!=null) {
	    			q.add(currnode.left);
	    		}
	    		if(currnode.right!=null) {
	    			q.add(currnode.right);
	    		}
	    	}
	    	}
	    }
	public static int count_of_node(node root) {
		if(root==null) {
			return 0;
		}
		int a=count_of_node(root.left);
		int b=count_of_node(root.right);
		return a+b+1;
	} 
	
	public static int sum_of_nodes(node root) {
		if(root==null) {
			return 0;
		}
		int a=sum_of_nodes(root.left);
		int b=sum_of_nodes(root.right);
		return a+b+root.data;
	}
	public static int height_of_nodes(node root) {
		if(root==null) {
			return 0;
		}
		int right_height=height_of_nodes(root.right);
		int left_height=height_of_nodes(root.left);
		int my_height=Math.max(right_height, left_height)+1;
		return my_height;
		
	}
	public static int diameter(node root) {
		if(root==null) {
			return 0;
		}
		int left_diam=diameter(root.left);
		int right_diam=diameter(root.right);
		int height=height_of_nodes(root.left)+height_of_nodes(root.right)+1;
		return Math.max(height,Math.max(left_diam, right_diam));
	}
	
	static class treeinfo{
		int ht;
		int diam;
		treeinfo(int ht,int diam){
			this.ht=ht;
			this.diam=diam;
		}
	}
	public static boolean isidentical(node root, node subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.data==subRoot.data){
        return isidentical( root.left,  subRoot.left) && isidentical( root.right, subRoot.right);}
        return false;
    }
	
	 public int maxDepth(node root) {
	        if(root==null) {
				return 0;
			}
	        if(root.right==null && root.left==null) {
	            return 1;
	        }
	        if(root.left==null){
			    return 1+maxDepth(root.right);
	        }
	        else if(root.right==null){
			      return 1+maxDepth(root.left);
	        }
			int my_height=1+Math.max(maxDepth(root.left), maxDepth(root.right));
			return my_height;
	    }
	
	 public  static boolean isSubtree(node root, node subRoot) {
		 if(subRoot==null){
	            return true;
	        }
	        if(root==null){
	            return false;
	        }
	        
	        if(root.data==subRoot.data){
	            if(isidentical(root,subRoot)){
	                return true;
	            }
	        }
	        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
	 }
	public static treeinfo optidiameter(node root) {
		if(root==null) {
			return new treeinfo(0,0);
		}
		treeinfo left=optidiameter(root.left);
		treeinfo right=optidiameter(root.right);
		
		int myheight=Math.max(left.ht,right.ht)+1;
		
		int diam1=left.diam;
		int diam2=right.diam;
		int diam3=left.ht+right.ht+1;
		int mydiam=Math.max(Math.max(diam1, diam2), diam3);
		treeinfo a=new treeinfo(myheight,mydiam);
		return a;
				
	}
	public static node ancestor(node root,int a,int b) {
		if(root==null) {
			return  null;
		}
		if(root.data==a || root.data==b) {
			return root;
		}
		node left=ancestor(root.left, a, b);
		node right=ancestor(root.right, a, b);
		if(left==null) {
			return right;
		}
		if(right==null) {
			return left;
		}
		return root;
	}
	public static int maximum(node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        binarytree a1=new binarytree();
        int nodes[]=  {4, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        int nodes1[]= {4, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        System.out.println("============buildtree========");
        node root=a1.buildtree(nodes);
//        node subRoot=a1.buildtree(nodes1);
        System.out.println(root.data);
        System.out.println("============preorder========");
        preorder(root);
        System.out.println();
        System.out.println("============inorder========");
        inorder(root);
        System.out.println();
        System.out.println("============inorder========");
        postorder(root);
        System.out.println("============levelorder========");
        levelorder(root);
        System.out.println("============count of nodes========");
        System.out.println(count_of_node(root));
        System.out.println("============sum of nodes========");
        System.out.println(sum_of_nodes(root));
        System.out.println("============height of nodes========");
        System.out.println(height_of_nodes(root));
        System.out.println("============diameter========");
        System.out.println(diameter(root));
        System.out.println("============Ancestor========");
        System.out.println(ancestor(root, 3, 6));
        System.out.println("============Optidiameter========");
        System.out.println(optidiameter(root).diam);
        System.out.println("============maximum node and minimum node in a tree========");
        System.out.println(maximum(root));
	}

}
