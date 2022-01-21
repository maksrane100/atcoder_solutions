package com.codechef;

/**
 * 
 * Problem : Brick Break
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc148/tasks/abc148_d
 *
 */

public class AtCoder_Brick_Break {

	public static void solve() throws Exception {
		int n = 10;
		

		int[] bricks = { 3, 11, 4, 12, 5, 9, 2, 6, 5, 3 };

		int brickNumber = 1;
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			
			//if we are finding brick in sequence, then keep the brick
			if (bricks[i] == brickNumber) {
				brickNumber++;
			} else {  //otherwise break the brick
				count++;
			}
		}

		if (brickNumber == 1) {
			System.out.println(-1);
			return;
		}

		System.out.println(count);
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
