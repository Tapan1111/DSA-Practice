package com.tapan.dsa.BinarySearch;

public class Sqrt_x {
	public static void main(String[] args) {
		int x = 12;
		System.out.println(solve(x));

	}

	public static int solve(int x) {
		int left = 0;
		int right = x;
		while (left < right) {
			int mid = (left + right) / 2;
			if (mid <= x / mid) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}
		return left;

	}

}
