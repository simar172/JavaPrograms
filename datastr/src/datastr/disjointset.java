package datastr;

public class disjointset {
	static int rank[];
	static int parent[];
	int n;
	disjointset(int n){
		rank=new int[n];
		parent=new int[n];
		this.n=n;
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
	}
	public static int find(int a) {
		if(parent[a]!=a) {
			parent[a]=find(parent[a]);
		}
		return parent[a];
	}
	
	public static void union(int x,int y) {
		int xroot=find(x);
		int yroot=find(y);
		if(xroot==yroot) {
			return;
		}
		if(rank[xroot]<rank[yroot]) {
			parent[xroot]=yroot;
		}
		else if(rank[yroot]<rank[xroot]) {
			parent[yroot]=xroot;
		}
		else {
			parent[xroot]=yroot;
			rank[xroot]=rank[xroot]+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disjointset a=new disjointset(5);
        union(0,2);
        union(4,2);
        union(3,1);
        if(find(2)==find(0)) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
	}

}
