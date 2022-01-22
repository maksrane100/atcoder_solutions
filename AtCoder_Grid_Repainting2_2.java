package com.codechef;

import java.util.Arrays;

/**
 * 
 * Problem : Grid Repainting 2
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc112/tasks/abc112_b
 *
 */

public class AtCoder_Grid_Repainting2_2 {

	public static void solve() throws Exception {

		//String s = "3 3";
		//String[] input = { ".#.", "###", ".#." };

		String s = "7 11";
		
		String[] input = { 
				"...#####...",
				".##.....##.",
				"#..##.##..#",
				"#..##.##..#",
				"#.........#",
				"#...###...#",
				".#########."
		};
		
		
		String[] heightWidthInput = s.split(" ");

		int numHeight = Integer.parseInt(heightWidthInput[0]);

		int numWidth = Integer.parseInt(heightWidthInput[1]);

		String[][] painting = new String[numHeight + 2][numWidth + 2];

		Arrays.fill(painting[0], ".");

		Arrays.fill(painting[numHeight + 1], ".");

		for (int i = 1; i <= numHeight; i++) {

			String in = input[i - 1];

			String row = "." + in + ".";

			String[] strArr = row.split("");

			painting[i] = strArr;
		}

		for (int row = 1; row <= numHeight; row++) {
			for (int col = 1; col <= numWidth; col++) {
				
				//if we find "." on upper cell, lower cell, left cell and the right cell of a cell containing "#",
				//it means that we can not paint that cell to black.
				
				//this is given in problem : he can only choose two squares that are horizontally or vertically 
				//adjacent and paint those squares black
				if (painting[row][col].equals("#")) {
					if (painting[row - 1][col].equals(".") && painting[row + 1][col].equals(".") && painting[row][col - 1].equals(".")
							&& painting[row][col + 1].equals(".")) {
				
						System.out.println("No");
						System.exit(0);
					
					}
				}
			}
		}

		System.out.println("Yes");
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
