package com.codechef;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 
 * Problem : Zabuton
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/cf17-final/tasks/cf17_final_d
 *
 */

public class AtCoder_Zabuton {

	static class Participant {
		int height;
		int power;

	}

	public static void solve() throws Exception {

		int n = 3;

		//int[][] input = { { 0, 2 }, { 1, 3 }, { 3, 4 } };

		// int[][] input = { { 0, 4 }, { 1, 3 }, { 5, 8 } };
		
		 int[][] input = { { 2, 4 }, {3, 1 }, { 4, 1 } };

		Participant[] participant_arr = new Participant[n];

		for (int i = 0; i < n; i++) {
			int[] in = input[i];

			participant_arr[i] = new Participant();

			participant_arr[i].height = in[0];
			participant_arr[i].power = in[1];
		}

		PriorityQueue<Participant> pq = new PriorityQueue<>(n, (a, b) -> -(a.power - b.power));

		int used_power = 0;

		Arrays.sort(participant_arr, (a, b) -> Integer.compare(a.height + a.power, b.height + b.power));

		for (Participant p : participant_arr) {

			if (used_power <= p.height) {
				used_power += p.power;
				pq.add(p);

			} else {
				// if current Participant's power is less than the power of the top of PQ
				// participant,
				// we will poll() from PQ and then add the current participant into the PQ
				if (pq.peek().power >= p.power) {
					used_power -= pq.poll().power;
					used_power += p.power;
					pq.add(p);
				}

			}
		}

		System.out.println(pq.size());

	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
