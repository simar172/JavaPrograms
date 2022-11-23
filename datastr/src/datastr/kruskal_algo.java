package datastr;
import java.util.*;
class Pare implements Comparable<Pare>{
    int src,dest,wt;
    public Pare(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
    public int compareTo(Pare that){
        return this.wt-that.wt;
    }
}
class Solution
{
    static int p[];
    public static int find(int x){
        if(p[x]==x){
            return x;
        }
        return find(p[x]);
    }
    
    public static void union(int x,int y){
        int rx=find(x);
        int ry=find(y);
        if(rx==ry){
            return ;
        }
        p[ry]=rx;
    }
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        boolean added[][]=new boolean[V][V];
        ArrayList<Pare> edge=new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                ArrayList<Integer> cur=adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)]=true;
                    added[cur.get(0)][i]=true;
                    edge.add(new Pare(i,cur.get(0),cur.get(1)));
                }
            }
        }
    
    p=new int[V];
    for(int i=0;i<V;i++){
        p[i]=i;
    }
    Collections.sort(edge);
    int ans=0;
    int count=1;
    for(int i=0;count<V;i++){
        Pare edgee=edge.get(i);
        int rx=find(edgee.src);
        int ry=find(edgee.dest);
        if(rx!=ry){
            union(rx,ry);
            count++;
            ans=ans+edgee.wt;
        }
    }return ans;
    }
}
public class kruskal_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
