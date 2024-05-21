package com.tapan.dsa.LinkedList;

public class DistributeCandy {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3 };
		System.out.println(solve(arr));

	}

	public static int solve(int[] input) {
		int noOfCandies = input.length;
		int diffTypeOfCnady = 1;
		int ans = 0;
		for (int i = 1; i < input.length; i++) {
			if (input[i] != input[i - 1]) {
				diffTypeOfCnady++;
			}
		}
		ans = Math.min(diffTypeOfCnady, noOfCandies / 2);
		return ans;
	}
}
