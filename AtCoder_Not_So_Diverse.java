package com.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * Problem : Not so Diverse
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc081/tasks/arc086_a
 *
 */

public class AtCoder_Not_So_Diverse {

	public static void solve() throws Exception {
		int n = 10;
		int k = 3;

		int[] arr = { 5, 1, 3, 2, 4, 1, 1, 2, 3, 4 };

		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {

			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}

		}

		System.out.println(map.toString());

		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		list.sort(Entry.comparingByValue());

		int count = 0;

		int nowListSize = list.size();

		for (int i = 0; i < list.size(); i++) {

			if (nowListSize > k) {
				nowListSize -= 1;
				count += list.get(i).getValue();
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
