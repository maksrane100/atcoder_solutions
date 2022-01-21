package com.codechef;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * Problem : Fennec vs Monster
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc153/tasks/abc153_c
 *
 */

public class AtCoder_Fennec_Vs_Monster {

	public static void solve() throws Exception {
		/*int n = 8;
		int k = 9;
		String input = "7 9 3 2 3 8 4 6";
		*/
		
		int n = 10;
		int k = 9;
		String input = "10 12 7 9 3 2 3 8 4 6";
		
		int[] arr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(arr);
		
		long result = 0;
		
		for (int i = 0; i < n - k; i++) {
			result += arr[i];
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
