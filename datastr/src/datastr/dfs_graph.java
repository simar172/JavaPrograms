package datastr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//ye ra link iska brave browser main chlega    https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1/#
public class dfs_graph {
	static int V;
	static LinkedList<Integer> a[];
	
	dfs_graph(int v){
		this.V=v;
		a=new LinkedList[v];
		for(int i=0;i<v;i++) {
			a[i]=new LinkedList<Integer>();
		}
	}
	public static void edges(int v,int w) {
		a[v].add(w);
	}
	public static void dfsutil(int s,boolean vis[]) {
		vis[s]=true;
		System.out.println(s+" ");
		Iterator<Integer> b=a[s].listIterator();
		while(b.hasNext()) {
			int n=b.next();
			if(!vis[n]) {
				dfsutil(n,vis);
			}
		}
	}
	public static void dfs(int s) {
		boolean vis[]=new boolean[V];
		dfsutil(s,vis);
	}
	
	
	//another approach starts here only works on ide
	public void dfsutil(int s,ArrayList<ArrayList<Integer>> adj,boolean vis[] ,ArrayList<Integer> ans){
        vis[s]=true;
        ans.add(s);
        for(int i:adj.get(s)){
            if(!vis[i]){
                dfsutil(i,adj,vis,ans);
            }
        }
  }
  public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
      // Code here
      boolean vis[]=new boolean[V];
      ArrayList<Integer> ans=new ArrayList<>();
       dfsutil(0,adj,vis,ans);
       return ans;
  }
        public static void main(String[] args) {
        	dfs_graph a=new dfs_graph(4);
        	edges(0, 1);
            edges(0, 2);
            edges(1, 2);
            edges(2, 0);
            edges(2, 3);
            edges(3, 3);
            dfs(2);
       }
}
