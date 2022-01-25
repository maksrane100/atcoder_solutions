package com.codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Problem : C - D - Five, Five Everywhere
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc096/tasks/abc096_d
 *
 */

public class AtCoder_Five_Five_Everywhere {

	public static void solve() {
		int n = 8;

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 1; i < 11110; i++) {
			int a = i * 5 + 1;
			if (isPrimeNumber(a)) {
				set.add(a);
			}
		}

		List<Integer> list = new ArrayList<Integer>(set);

		Collections.sort(list);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(list.get(i));
			sb.append(" ");
		}

		System.out.println(sb.toString());
	}

    
    public static boolean isPrimeNumber(long num) {
		boolean flag = false;

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			return true;
		else
			return false;
	}


	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
