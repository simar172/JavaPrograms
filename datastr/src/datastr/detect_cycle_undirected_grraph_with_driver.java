package datastr;

import java.util.*;
import java.util.LinkedList;

public class detect_cycle_undirected_grraph_with_driver {
//leetcode sol 
	boolean dfs(int V, int vis[], ArrayList<ArrayList<Integer>> adj, int parent) {
		if (vis[V] == 1)
			return true;
		vis[V] = 1;
		for (int i : adj.get(V)) {
			if (vis[i] != 2) {
				if (dfs(i, vis, adj, V)) {
					vis[i] = 2;
					return true;
				}
			}
		}
		vis[V] = 2;
		return false;
	}

	public boolean canFinish(int num, int[][] prerequisites) {
		if (prerequisites.length == 0)
			return true;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			adj.add(new ArrayList<Integer>());
		}
		for (int i[] : prerequisites) {
			adj.get(i[0]).add(i[1]);
		}

		int vis[] = new int[num];
		for (int i = 0; i < num; i++) {
			if (dfs(i, vis, adj, -1)) {
				return false;
			}
		}
		return true;
	}
	
	
	/////////////////////////////////////////////////////////////

	static int V;
	static LinkedList a[];

	detect_cycle_undirected_grraph_with_driver(int v) {
		this.V = v;
		a = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			a[i] = new LinkedList();
		}
	}

	public static void addedge(int v, int w) {
		a[v].add(w);
		a[w].add(v);
	}

	public static boolean dfsutil(int v, boolean vis[], int parent) {
		vis[v] = true;
		Iterator<Integer> c = a[v].iterator();
		while (c.hasNext()) {
			int i = c.next();
			if (!vis[i]) {
				if (dfsutil(i, vis, v)) {
					return true;
				}

			} else if (i != parent) {
				return true;
			}
		}
		return false;
	}

	public static boolean cycle(int s) {
		boolean vis[] = new boolean[s];
		for (int i = 0; i < V; i++) {
			vis[i] = false;
		}
		for (int j = 0; j < V; j++) {
			if (!vis[j]) {
				if (dfsutil(j, vis, -1)) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detect_cycle_undirected_grraph_with_driver t = new detect_cycle_undirected_grraph_with_driver(5);
		addedge(0, 1);
		addedge(1, 2);
		addedge(2, 1);
		addedge(0, 3);
		addedge(3, 4);
		if (cycle(V)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
