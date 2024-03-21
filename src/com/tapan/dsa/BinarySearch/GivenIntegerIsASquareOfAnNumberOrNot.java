package com.tapan.dsa.BinarySearch;

public class GivenIntegerIsASquareOfAnNumberOrNot {
	public static void main(String[] args) {
		int x = 144;
		System.out.println(is_Square(x));
	}

	public static boolean is_Square(int x) {
		int l = 0;
		int h = x;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (mid * mid == x) {
				return true;
			} else if (mid * mid > x) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}

}
