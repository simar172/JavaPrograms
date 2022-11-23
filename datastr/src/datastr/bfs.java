package datastr;

import java.util.*;

public class bfs {
	static int V;
	static LinkedList<Integer> a[];

	bfs(int v) {
		this.V = v;
		a = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			a[i] = new LinkedList<>();
		}
	}

	static void edge(int v, int w) {
		a[v].add(w);
	}

	public static void Bfs(int s) {
		boolean vis[] = new boolean[V];
		LinkedList<Integer> b = new LinkedList<>();
		vis[s] = true;
		b.add(s);
		while (!b.isEmpty()) {
			s = b.poll();
			System.out.println(s + " ");
			Iterator<Integer> c = a[s].listIterator();
			while (c.hasNext()) {
				int n = c.next();
				if (!vis[n]) {
					vis[n] = true;
					b.add(n);
				}
			}
		}
	}

//      another approach of bfs
	public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		// Code here
		ArrayList<Integer> a = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		boolean vis[] = new boolean[V];
		q.add(0);
		vis[0] = true;
		while (!q.isEmpty()) {
			int node = q.poll();
			a.add(node);
			for (int i : adj.get(node)) {
				if (!vis[i]) {
					vis[i] = true;
					q.add(i);
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bfs a = new bfs(4);
		edge(0, 1);
		edge(0, 2);
		edge(1, 2);
		edge(2, 0);
		edge(2, 3);
		edge(3, 3);
		Bfs(2);
	}

}
