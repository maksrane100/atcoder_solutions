package com.codechef;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 
 * Problem : Streamline
 * 
 * Problem Link : https://atcoder.jp/contests/abc117/tasks/abc117_c
 *
 */

public class AtCoder_Streamline {

	public void solve() {

		int n = 2;
		int m = 5;
		int[] arr = { 10, 12, 1, 2, 14 };

		Arrays.sort(arr);

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 1; i < m; i++) {
			queue.add(arr[i] - arr[i - 1]);
		}

		long answer = 0;

		int end = Math.max(m - n, 0);

		for (int i = 0; i < end; i++) {
			answer += queue.poll();
		}

		System.out.println(answer);
	}

	public static void main(String args[]) {
		AtCoder_Streamline obj = new AtCoder_Streamline();
		obj.solve();

	}

}
