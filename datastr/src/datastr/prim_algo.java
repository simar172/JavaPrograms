package datastr;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair1 implements Comparable<Pair1>{
    int v;
    int wt;
    Pair1(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
    public int compareTo(Pair1 that){
        return this.wt-that.wt;
    }
}
public class prim_algo {
	static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        boolean vis[]=new boolean[V];
        PriorityQueue<Pair1> a=new PriorityQueue<>();
        a.add(new Pair1(0,0));
        int ans=0;
        while(a.size()!=0){
            Pair1 cur=a.remove();
            int u=cur.v;
            if(vis[u]){
                continue;
            }
            ans=ans+cur.wt;
            vis[u]=true;
            ArrayList<ArrayList<Integer>> b=adj.get(u);
            for(ArrayList<Integer> c:b){
                int vertex=c.get(0);
                int weight=c.get(1);
                if(vis[vertex]==false){
                    a.add(new Pair1(vertex,weight));
                }
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ye ra link https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1
		int v=3;
		int e=3;
		ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<ArrayList<ArrayList<Integer>>>();
		for(int i=0;i<v;i++) {
		adj.add(new ArrayList<ArrayList<Integer>>());
		}
		
		System.out.println(spanningTree(v, adj ));
	}
	

}
