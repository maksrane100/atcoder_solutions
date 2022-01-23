package com.codechef;

import java.util.Arrays;

/**
 * 
 * Problem : Christmas Eve
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc115/tasks/abc115_c
 *
 */

public class AtCoder_Christmas_Eve {

	public static void solve() throws Exception {

		int n = 6;

		int k = 3;

		int[] heights = { 10, 15, 14, 20, 24, 22 };

		int[] diff_arr = new int[n];

		Arrays.sort(heights);

		diff_arr[0] = 0;

		for (int i = 1; i < n; i++) {
			diff_arr[i] = heights[i] - heights[i - 1] + diff_arr[i - 1];
		}

		int answer = Integer.MAX_VALUE;

		for (int i = 0; i < n - k + 1; i++) {
			answer = Math.min(diff_arr[i + k - 1] - diff_arr[i], answer);
		}

		System.out.println(answer);
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
