package datastr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

class Pair implements Comparable<Pair> {
	int vertex;
	int wt;

	Pair(int vertex, int wt) {
		this.vertex = vertex;
		this.wt = wt;
	}

	@Override
	public int compareTo(Pair that) {
		// TODO Auto-generated method stub
		return this.wt - that.wt;
	}
}

public class dijkstra_algo {
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
		PriorityQueue<Pair> a = new PriorityQueue<>();
		boolean vis[] = new boolean[V];
		a.add(new Pair(S, 0));
		int ans[] = new int[V];
		Arrays.fill(ans, 100000);
		ans[S] = 0;
		while (a.size() != 0) {
			Pair cur = a.poll();
			int u = cur.vertex;
			if (vis[u]) {
				continue;
			}
			vis[u] = true;
			ArrayList<ArrayList<Integer>> c = adj.get(u);
			for (ArrayList<Integer> d : c) {
				int vertex = d.get(0);
				int weight = d.get(1);
				if (ans[vertex] > ans[u] + weight) {
					ans[vertex] = ans[u] + weight;
					a.add(new Pair(vertex, ans[vertex]));
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;
		ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
		int S = 6;

       System.out.println(dijkstra(V,  adj, S));
	}

}
