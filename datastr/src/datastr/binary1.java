package datastr;

import java.util.LinkedList;
import java.util.Queue;

public class binary1 {
      public static class node{
    	   int data;
    	   node right;
    	   node left;
    	   node(int data){
    		   this.data=data;
    		   this.right=null;
    		   this.left=null;
    	   }
       }
       static class binary{
    	   static int idx=-1;
    	   public static node buildtree(int nodes[]) {
    		   idx++;
    		   if(nodes[idx]==-1) {
    			   return null;
    		   }
    		   node a1=new node(nodes[idx]);
    		   a1.left=buildtree(nodes);
    		   a1.right=buildtree(nodes);
    		   return a1;
    	   }
       }
       public static void preorder(node root) {
    	   if(root==null) {
    		   return;
    	   }
    	   System.out.println(root.data);
    	   preorder(root.left);
    	   preorder(root.right);
       }
       public static void inorder(node root) {
    	   if(root==null) {
    		   return;
    	   }
    	   inorder(root.left);
    	   System.out.println(root.data);
    	   inorder(root.right);
       }
       public static void postorder(node root) {
    	   if(root==null) {
    		   return;
    	   }
    	   postorder(root.left);
    	   postorder(root.right);
    	   System.out.println(root.data);
       }
       
       public static void level_order(node root) {
    	   Queue<node> q=new LinkedList<>();
    	   q.add(root);
    	   q.add(null);
    	   while(!q.isEmpty()) {
    		   node currnode=q.remove();
    		   if(currnode==null) {
    			   System.out.println();
    		       if(q.isEmpty()) {
    			      break;
    		         }
    		       else {
//    			       System.out.println();
    			       q.add(null);
    		           }
    	           }
    		   else {
    			   System.out.print(currnode.data);
    			   
    			   if(currnode.left!=null) {
//    				   System.out.println();
    				   q.add(currnode.left);
    			   }
    			   if(currnode.right!=null){
//    				   System.out.println();
    				   q.add(currnode.right);
    			   }
    			        }
    		   }
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {4, 7, 6, 2, -1, -1, -1, -1, 3, -1, 6, -1, -1};
//        {4,7,6,-1,-1,-1,2,5,1,-1,-1,3,-1};
        binary a2=new binary();
        node a3=a2.buildtree(arr);
        System.out.println("======================preorder======================");
        preorder(a3);
        System.out.println("==================inorder===================");
        inorder(a3);
        System.out.println("==================postorder===================");
        postorder(a3);
        System.out.println("==================Level_order===================");
        level_order(a3);
	}

}
