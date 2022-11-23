package datastr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class cycle_directed_graph_withdriver_dfs {
       static int V;
       static List<List<Integer>> a;
       cycle_directed_graph_withdriver_dfs(int v){
    	   this.V=v;
    	   a=new ArrayList<>();
    	   for(int i=0;i<v;i++) {
    		   a.add(new LinkedList());
    	   }
       }
       public static void addedge(int v,int w) {
    	   a.get(v).add(w);
       }
       public static boolean iscycle(int v,boolean vis[],boolean recs[]) {
    	   if(recs[v]) {
    		   return true;
    	   }
    	   if(vis[v]) {
    		   return false;
    	   }
    	   vis[v]=true;
    	   recs[v]=true;
    	   List<Integer> c=a.get(v);
    	   for(Integer t:c) {
    		   if(iscycle(t,vis,recs)) {
    			   return true;
    		   }
    	   }recs[v]=false;
    	   return false;
       }
       public static boolean cycle() {
    	   boolean vis[]=new boolean[V];
    	   boolean recs[]=new boolean[V];
    	   for(int i=0;i<V;i++) {
    		   if(iscycle(i,vis,recs)) {
    			   return true;
    		   }
    	   }return false;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cycle_directed_graph_withdriver_dfs b=new cycle_directed_graph_withdriver_dfs(4);
		addedge(0, 1);
		addedge(0, 2);
		addedge(1, 2);
		addedge(2, 0);
		addedge(2, 3);
		addedge(3, 3);
		if(cycle()) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
