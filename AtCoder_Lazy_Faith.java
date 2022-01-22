package com.codechef;

import java.util.TreeSet;

/**
 * 
 * Problem : Lazy Faith
 * 
 * Problem Link : https://atcoder.jp/contests/abc119/tasks/abc119_d
 *
 */

public class AtCoder_Lazy_Faith {

	public static void solve() {

		int a = 2;
		int b = 3;
		int q = 4;

		long[] input = { 100, 600, 400, 900, 1000, 150, 2000, 899, 799 };

		TreeSet<Long> shrinesSet = new TreeSet<>();

		int j = 0;

		for (int i = 0; i < a; i++) {
			shrinesSet.add(input[j++]);
		}

		TreeSet<Long> templesSet = new TreeSet<>();
		for (int i = 0; i < b; i++) {
			templesSet.add(input[j++]);
		}

		long[] x = new long[q];

		for (int i = 0; i < q; i++) {
			x[i] = input[j++];
		}

		for (int i = 0; i < q; i++) {

			long ans = Long.MAX_VALUE;

			Long sl = shrinesSet.floor(x[i]);

			Long sr = shrinesSet.ceiling(x[i]);

			Long tl = templesSet.floor(x[i]);

			Long tr = templesSet.ceiling(x[i]);

			if (sl != null && tl != null) {
				ans = Math.min(ans, x[i] - Math.min(sl, tl));
			}

			if (sr != null && tr != null) {
				ans = Math.min(ans, Math.max(sr, tr) - x[i]);
			}

			if (sl != null && tr != null) {
				ans = Math.min(ans, tr - sl + Math.min(tr - x[i], x[i] - sl));
			}

			if (sr != null && tl != null) {
				ans = Math.min(ans, sr - tl + Math.min(sr - x[i], x[i] - tl));
			}

			System.out.println(ans);
		}

	}

	public static void main(String args[]) {
		solve();

	}

}
