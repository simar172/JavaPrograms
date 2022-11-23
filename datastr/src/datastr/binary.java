package datastr;

import java.util.ArrayList;

public class binary {
	static class node{
		int data;
		node right;
		node left;
		node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}
	static class bin{
		static int idx=-1;
		
		 public ArrayList<Integer> solve(node root, int B) {
		        ArrayList<Integer> ans=new ArrayList<Integer>();
		        if(root==null){
		            return ans;
		        }
		        if(root.data==B){
		            ans.add(root.data);
		        }
		        if(root.data>B){
		            ans.add(root.left.data);
		            solve(root.left,B);
		        }
		        else{
		            ans.add(root.right.data);
		           solve(root.right,B);
		        }
		        return ans;
		    }
		
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
	public static void preorder(node root) {
		if(root==null) {
			return ;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        bin a2=new bin();
//        node root=a2.buildtree(nodes);
//       a2.left=root.data;
//        System.out.println(root.data);
        
       
//        a2.preorder(root);
	}

}
