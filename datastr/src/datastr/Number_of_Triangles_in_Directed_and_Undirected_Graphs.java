package datastr;

public class Number_of_Triangles_in_Directed_and_Undirected_Graphs {
	
	public static int triangles(int graph[][],boolean isdirected) {
		int tri=0;
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph.length;j++) {
				for(int k=0;k<graph.length;k++) {
					if(graph[i][j]==1 && graph[i][k]==1 && graph[k][j]==1) {
						tri++;
					}
					
				}
			}
		}
		if(isdirected) {
			tri=tri/3;
		}
		else {
			tri=tri/6;
		}return tri;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int graph[][] = {{0, 1, 1, 0},
                 {1, 0, 1, 1},
                 {1, 1, 0, 1},
                 {0, 1, 1, 0}
                };
		 System.out.println(triangles(graph, false));
	}

}
