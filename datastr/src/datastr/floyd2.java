package datastr;

public class floyd2 {
	final static int inf=999999,V=4;
    public static void floyd(int graph[][]) {
    	int dist[][]=new int[V][V];
    	for(int i=0;i<V;i++) {
    		for(int j=0;j<V;j++) {
    			dist[i][j]=graph[i][j];
    		}
    	}
    	
    	for(int i=0;i<V;i++) {
    		for(int j=0;j<V;j++) {
    			for(int k=0;k<V;k++) {
    				if(dist[i][j]>dist[i][k]+dist[k][j]) {
    					dist[i][j]=dist[i][k]+dist[k][j];
    				}
    			}
    		}
    	}printsol(dist);
    }
    
    static void printsol(int dist[][]) {
    	for(int i=0;i<V;i++) {
    		for(int j=0;j<V;j++) {
    			if(dist[i][j]==inf) {
    				System.out.print("inf");
    			}
    			else {
    				System.out.print(dist[i][j]+" " );
    			}
    		}System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = { {0, 5, inf, 10},
				{inf, 0, 3, inf},
				{inf, inf, 0, 1},
				{inf, inf, inf, 0}
				};
		floyd(graph);
	}

}
