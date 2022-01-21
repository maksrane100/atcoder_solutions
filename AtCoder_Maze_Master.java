package com.codechef;

import java.util.ArrayDeque;

/**
 * 
 * Problem : Maze Master
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc151/tasks/abc151_d
 *
 */

public class AtCoder_Maze_Master {

	static class Point {
		int r;
		int c;

		Point(int h, int w) {
			this.r = h;
			this.c = w;
		}
	}

	static char matrix[][];

	static int dw[] = { 1, 0, -1, 0 };

	static int dh[] = { 0, 1, 0, -1 };

	public static void solve() throws Exception {
		int h = 4;
		int w = 4;

		String[] grid = { "....", ".##.", ".##.", "...." };

		matrix = new char[h][w];

		for (int i = 0; i < h; i++) {
			matrix[i] = grid[i].toCharArray();
		}

		int result = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {

				if (matrix[i][j] == '#')
					continue;

				boolean visited[][] = new boolean[h][w];

				int distance[][] = new int[h][w];

				visited[i][j] = true;

				ArrayDeque<Point> q = new ArrayDeque<Point>();

				// we will do BFS for each and every (i,j) position. And calculate the maximum
				// distance that can
				// be travelled starting from that (i,j) cell.

				q.add(new Point(i, j));

				distance[i][j] = 0;

				// BFS Starts
				while (!q.isEmpty()) {

					Point p = q.poll();

					for (int k = 0; k < 4; k++) {

						int nh = p.r + dh[k];

						int nw = p.c + dw[k];

						// check if new coordiinate is within the boundary
						if (nh >= h || nh < 0 || nw >= w || nw < 0)
							continue;

						if (matrix[nh][nw] == '#')
							continue;

						if (visited[nh][nw])
							continue;

						visited[nh][nw] = true;

						// adding one to distance as we are going one step ahead
						distance[nh][nw] = distance[p.r][p.c] + 1;

						// we will update the result if this distance we are seeing is more than the
						// previously seen maximum distance

						result = Math.max(result, distance[nh][nw]);

						q.add(new Point(nh, nw));
					}
				}

			}
		}

		System.out.println(result);
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
