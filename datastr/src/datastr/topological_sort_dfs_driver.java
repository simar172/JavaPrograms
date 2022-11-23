package datastr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class topological_sort_dfs_driver {
	static int V;
	static ArrayList<ArrayList<Integer>> a;
	topological_sort_dfs_driver(int v){
		this.V=v;
		a=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			a.add(new ArrayList<Integer>());
		}
	}
	
	public static void addEdge(int v,int w) {
		a.get(v).add(w);
	}
    
	public static void dfsutil(int v,boolean vis[],Stack<Integer> s) {
		vis[v]=true;
		Iterator<Integer> e=a.get(v).iterator();
		while(e.hasNext()) {
			int i=e.next();
			if(!vis[i]) {
				dfsutil(i,vis,s);
			}
		}
		s.push(v);
	}
	
	public static void topo() {
		Stack<Integer> b=new Stack<>();
		boolean vis[]=new boolean[V];
		for(int i=0;i<V;i++) {
			vis[i]=false;
		}
		
		for(int i=0;i<V;i++) {
			if(vis[i]==false) {
				dfsutil(i,vis,b);
			}
		}
		while(!b.isEmpty()) {
			System.out.println(b.pop());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topological_sort_dfs_driver t=new topological_sort_dfs_driver(6);
		addEdge(5, 2);
        addEdge(5, 0);
        addEdge(4, 0);
        addEdge(4, 1);
        addEdge(2, 3);
        addEdge(3, 1);
        topo();
	}

}
