package com.codechef;

import java.util.HashMap;

/**
 * 
 * Problem : C - Colorful Candies
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc210/tasks/abc210_c
 *
 */

public class AtCoder_Colorful_Candies {

	public static void solve() throws Exception {
		int N = 5;
		int K = 5;
		int[] candy = { 4, 4, 4, 4, 4 };

		// <candy type, frequency> map
		HashMap<Integer, Integer> map = new HashMap<>();

		int result = 0;

		int current = 0;
		
		int right = 0;

		for (int left = 0; left < N - K + 1; left++) {

			while (right - left < K) {

				int color = candy[right];

				int num = map.getOrDefault(color, 0);

				// if its a new color that we are seeing first time
				if (num == 0) {
					current++;
				}

				map.put(color, num + 1);

				right++;
			}

			result = Math.max(result, current);

			int color = candy[left];

			int num = map.get(color);

			if (num == 1) {
				current--;
			}

			map.put(color, num - 1);
		}

		System.out.println(result);
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
