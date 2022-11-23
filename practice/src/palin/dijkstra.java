package palin;

import java.util.*;

class weigthtedNode implements Comparable<weigthtedNode>{
	String name;
	public ArrayList<weigthtedNode> neighbors=new ArrayList<weigthtedNode>();
	HashMap<weigthtedNode,Integer> weightedmap=new HashMap<weigthtedNode,Integer>();
	int index;
	int dist;
	public boolean isvisited=false;
	public weigthtedNode parent;
	
	weigthtedNode(String name,int index){
		this.name=name;	
		dist=Integer.MAX_VALUE;
		this.index=index;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(weigthtedNode o) {
		return this.dist-o.dist;
	}
}

class weightedgraph{
	ArrayList<weigthtedNode> nodelist=new ArrayList();
	public weightedgraph(ArrayList<weigthtedNode> nodelist) {
	           this.nodelist=nodelist;
	}
	void dijkstra(weigthtedNode node) {
		PriorityQueue<weigthtedNode> queue =new PriorityQueue<>();
		node.dist=0;
		while(!queue.isEmpty()) {
			weigthtedNode currnode=queue.remove();
			for(weigthtedNode neighbor: currnode.neighbors) {
				if(queue.contains(neighbor)) {
				if(neighbor.dist>currnode.dist+currnode.weightedmap.get(currnode)) {
					neighbor.dist=currnode.dist+currnode.weightedmap.get(currnode);
					neighbor.parent=currnode;
					queue.remove(neighbor);  
					queue.add(neighbor);
				}
				}
			}
		}
		
	}
}
public class dijkstra {

}
