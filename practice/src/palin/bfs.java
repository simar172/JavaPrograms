package palin;

import java.util.ArrayList;
import java.util.LinkedList;

public class bfs {
	public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[]) {
		LinkedList<Integer> queue = new LinkedList<>();
		boolean visited[] = new boolean[v + 1];

		for (int i = 0; i < v; i++) {
			visited[i] = false;
			dist[i] = Integer.MAX_VALUE;
			pred[i] = -1;
		}
		visited[src] = true;
		dist[src] = 0;
		queue.add(src);

		while (!queue.isEmpty()) {
			int cur = queue.remove();
			for (int i = 0; i < adj.get(cur).size(); i++) {
				int neighbour = adj.get(cur).get(i);
				if (visited[neighbour] == false) {
					visited[neighbour] = true;
					dist[neighbour] = dist[cur] + 1;
					pred[neighbour] = cur;
					queue.add(neighbour);

					if (neighbour == dest) {
						System.out.println("Distance between source & destination: " + dist[dest]);
						return true;
					}
				}
			}
		}

		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<ArrayList<Integer>> adj
		 = new ArrayList ();
		int v=6;
		 boolean[] vis=new boolean [v+1];
		 int[] pred= new int [v+1];
		 
		
		 int dist[] = new int [v+1];
		 int components = 0;
		 for(int i=1;i<=v; i++) {
		 if(!vis[i]) {
		 components++;
		 bfs (adj, 1, 6, v, pred, dist);
		 }
		 }
		

}}
