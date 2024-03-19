package com.tapan.dsa.leetcodeMedium;

public class TotalHammingDistance {
	public static void main(String[] args) {
		int[] arr = { 4, 14, 2 };
		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int xorResult = 0;
		int count = 0;
		for (int val : arr) {
			xorResult = xorResult ^ val;
			while (xorResult > 0) {
				xorResult = xorResult & (xorResult - 1);
				count++;
			}
		}
		return count;
	}

}
