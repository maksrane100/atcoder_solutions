package com.codechef;

/**
 * 
 * Problem : Grid Components
 * 
 * Problem Link : https://atcoder.jp/contests/arc093/tasks/arc093_b
 *
 */

public class AtCoder_Grid_Components {

	public void solve() {

		int a = 4;
		int b = 125;

		int n = 100;

		char[][] grid = new char[n][n];

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = '.';
			}
		}

		for (int i = n / 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = '#';
			}
		}

		a--;

		b--;

		for (int i = 0; i < n / 2; i += 2) {
			boolean flag = true;

			for (int j = 0; j < n; j += 2) {

				if (b > 0) {
					grid[i][j] = '#';
					b--;
				} else {
					flag = false;
					break;
				}
			}

			if (!flag)
				break;
		}

		for (int i = (n / 2) + 1; i < n; i += 2) {

			boolean ok = true;

			for (int j = 0; j < n; j += 2) {

				if (a > 0) {
					grid[i][j] = '.';
					a--;
				} else {
					ok = false;
					break;
				}
			}

			if (!ok)
				break;
		}

		System.out.println(n + " " + n);
		
		//printing the grid with black and white components
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		AtCoder_Grid_Components obj = new AtCoder_Grid_Components();
		obj.solve();

	}

}
