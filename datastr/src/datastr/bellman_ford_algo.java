package datastr;

public class bellman_ford_algo {
	 public static int isNegativeWeightCycle(int n, int[][] edges)
	    {
	        int dist[]=new int[n];
	        for(int count=1;count<n;count++){
	            for(int j=0;j<edges.length;j++){
	                int src=edges[j][0];
	                int dest=edges[j][1];
	                int weight=edges[j][2];
	                if(dist[src]+weight<dist[dest]){
	                    dist[dest]=dist[src]+weight;
	                }
	            }
	        }for(int j=0;j<edges.length;j++){
	                int src=edges[j][0];
	                int dest=edges[j][1];
	                int weight=edges[j][2];
	                if(dist[src]+weight<dist[dest]){
	                    return 1;
	                }
	            }return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ye ra link microsoft edge main kiya hai https://practice.geeksforgeeks.org/problems/negative-weight-cycle3504/1
		int[][] edges = { { 0,1,-1 }, { 1,2,-2 },{2,0,-3} };
	     
		System.out.println(isNegativeWeightCycle(3,edges));
	}

}
