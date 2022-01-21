package com.codechef;

/**
 * 
 * Problem : GeT AC
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc122/tasks/abc122_c
 *
 */

public class AtCoder_Get_AC {

	public static void solve() throws Exception {

		int n = 8;
		int q = 3;
		
		String s = "ACACTACG";
		
		int[][] queries = { { 3, 7 }, { 2, 3 }, { 1, 8 } };

		int[] a = new int[n + 1];
		
		int count = 0;
		
		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
				count++;
			}

			a[i + 1] = count;
		}

		for (int i = 0; i < q; i++) {
			
			int[] query = queries[i];

			int l = query[0] - 1;

			int r = query[1] - 1;

			System.out.println(a[r] - a[l]);
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
