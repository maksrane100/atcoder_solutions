package com.codechef;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 
 * Problem : AtCoder  - Red and Green Apples -  Interesting Optimization Problem
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc160/tasks/abc160_e
 *
 */

public class AtCoder_Red_And_Green_Apples {

	public static void solve() throws Exception {
		int x = 2;
		int y = 2;
		int a = 2;
		int b = 2;
		int c = 2;

		int[] arrA = { 8, 6 };

		Arrays.sort(arrA);

		long totalRedApples = 0;

		PriorityQueue<Integer> redApplesPQ = new PriorityQueue<>();

		for (int i = 0; i < x; i++) {
			redApplesPQ.add(arrA[a - i - 1]);
			totalRedApples += arrA[a - i - 1];
		}

		int[] arrB = { 9, 1 };

		Arrays.sort(arrB);

		long totalGreenApples = 0;

		PriorityQueue<Integer> greenApplesPQ = new PriorityQueue<>();

		for (int i = 0; i < y; i++) {
			greenApplesPQ.add(arrB[b - i - 1]);
			totalGreenApples += arrB[b - i - 1];
		}

		int[] arrC = { 2, 1 };

		Arrays.sort(arrC);

		for (int cAppleValue : arrC) {

			if (cAppleValue > redApplesPQ.peek() || cAppleValue > greenApplesPQ.peek()) {
				
				if (redApplesPQ.peek() < greenApplesPQ.peek()) {
					totalRedApples -= redApplesPQ.poll();
					totalRedApples += cAppleValue;
					redApplesPQ.add(cAppleValue);
				} else {
					totalGreenApples -= greenApplesPQ.poll();
					totalGreenApples += cAppleValue;
					greenApplesPQ.add(cAppleValue);
				}
				
			}
		}

		System.out.println(totalRedApples + totalGreenApples);

	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
