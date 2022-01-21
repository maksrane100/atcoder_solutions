package com.codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Problem : Takahashi Tour
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc213/tasks/abc213_d
 *
 */

public class AtCoder_Takahashi_Tour {

	static List<Integer> answer = new ArrayList<>();

	static class Graph {
		
		private int type;
		
		private List<List<Integer>> adjacencyList = new ArrayList<>();

		public Graph(int n, int type) {
			this.type = type;
			
			for (int i = 0; i < n; i++)
				adjacencyList.add(new ArrayList<>());
		}

		public void addEdge(int u, int v) {
			e(u).add(v);
			
			if (type == 0)
				e(v).add(u);
		}

		public List<Integer> e(int idx) {
			return adjacencyList.get(idx);
		}
	}

	public static void solve() throws Exception {
		int n = 5;

		int[][] edges = {{1,2},{1,3},{1,4},{1,5} };

		Graph graph = new Graph(n, 0);

		for (int i = 0; i < n - 1; i++) {
			int[] e = edges[i];
			
			//using 0 based indexing
			int a = e[0] - 1;
			int b = e[1] - 1;
			graph.addEdge(a, b);
		}

		// sorting as we want to visit the smallest integer city first
		for (int i = 0; i < n; i++) {
			Collections.sort(graph.e(i));
		}

		boolean[] visited = new boolean[n];

		visited[0] = true;

		dfs(0, 0, graph, visited);

		for (int x : answer) {
			System.out.print(x + " ");
		}

		System.out.println();
	}

	static void dfs(int start, int depth, Graph graph, boolean[] visited) {

		answer.add(start + 1);

		for (int u : graph.e(start)) {

			if (visited[u])
				continue;

			visited[u] = true;

			dfs(u, depth + 1, graph, visited);

			answer.add(start + 1);
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
