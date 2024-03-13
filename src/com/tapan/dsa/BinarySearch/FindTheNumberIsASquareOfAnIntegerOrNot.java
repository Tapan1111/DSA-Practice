package com.tapan.dsa.BinarySearch;

public class FindTheNumberIsASquareOfAnIntegerOrNot {
	public static void main(String[] args) {
		int n = 625;
		System.out.println(isSquare(n));

	}

	public static boolean isSquare(int n) {
		int s = 0;
		int e = n;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (mid * mid == n) {
				return true;
			} else if (mid * mid > n) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return false;
	}

//	private static boolean isGood(int mid, int n) {
//		if (mid * mid == n) {
//			return true;
//		}
//
//		return false;
//	}

}
