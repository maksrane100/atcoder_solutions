package com.codechef;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * Problem : Tour
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc204/tasks/abc204_c
 *
 */

public class AtCoder_Tour {

	public static void solve() throws Exception {

		int n = 4;

		int m = 4;

		int[][] input = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 1 } };

		List<List<Integer>> adjacencyList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adjacencyList.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int edge[] = input[i];

			int a = edge[0] - 1;
			int b = edge[1] - 1;

			// uni- directional roads
			adjacencyList.get(a).add(b);
		}

		int pairs = 0;

		for (int i = 0; i < n; i++) {

			Queue<Integer> queue = new ArrayDeque<>();

			queue.add(i);

			boolean[] visited = new boolean[n];

			visited[i] = true;

			pairs++; // Puma can travel zero roads. This is given. So counting a node (that can pair
						// with itself)

			// if she is travelling
			// BFS starts
			while (!queue.isEmpty()) {

				int cur = queue.poll();

				for (int next : adjacencyList.get(cur)) {
					if (!visited[next]) {
						queue.add(next);
						visited[next] = true;
						pairs++; // This is a pair containing source node and its adjacent node.
					}
				}
			}

		}

		// output total number of pairs found
		System.out.println(pairs);

	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
