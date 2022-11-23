package palin;
import java.util.*;
class weightnode{
	ArrayList<weightnode> neighbors=new ArrayList();
	HashMap<weightnode,Integer> weightmap=new HashMap<>();
	int dist;
    String name;
    boolean isvisited=false;
    int index;
    public weightnode parent;
    weightnode(String name,int index){
    	this.name=name;
    	dist=Integer.MAX_VALUE;
    	this.index=index;
    }
    public String toString() {
    	return name;
    }
    public int compareTo(weightnode o) {
    	return this.dist-o.dist;
    }
}
class weightedgraph{
	ArrayList<weightnode> nodelist=new ArrayList();
	weightedgraph(ArrayList<weightnode> nodelist){
		this.nodelist=nodelist;
	}
	void dijkstra(weightnode node) {
		PriorityQueue<weightnode> queue=new PriorityQueue<>();
		queue.addAll(nodelist);
		while(!queue.isEmpty()) {
			weightnode currnode=queue.remove();
			for(weightnode neighbor:currnode.neighbors) {
				if(queue.contains(neighbor)) {
					if(neighbor.dist>currnode.dist+currnode.weightmap.get(currnode)) {
						neighbor.dist=currnode.dist+currnode.weightmap.get(currnode);
						neighbor.parent=currnode;
						queue.remove(neighbor);
						queue.add(neighbor);
					}
				}
			}
		}
		for(weightnode tocheck:nodelist) {
			System.out.println("Node tocheck"+tocheck+"dist "+tocheck.dist);
			pathprint(tocheck);
			System.out.println();
		}
	}
	public static void pathprint(weightnode node) {
		if(node.parent!=null) {
			pathprint(node.parent);
		}
		System.out.print(node.name);
	}
}
public class dijkstra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
