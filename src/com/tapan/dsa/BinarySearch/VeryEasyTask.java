package com.tapan.dsa.BinarySearch;

public class VeryEasyTask {
	public static void main(String[] args) {
		int n = 5;
		int x = 1;
		int y = 2;
		System.out.println(minTime(n, x, y));
	}

	private static int  minTime(int n, int x, int y) {
		
		if(n == 1) {
			return Math.min(x, y);
		}
		
		int l = 0;
		int h = Math.max(x, y) * n;
		int ans = 0;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (isGood(n, x, y, mid)) {
				ans = mid;
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
	
		return ans + Math.min(x, y);
	}

	private static boolean isGood(int n, int x, int y, int mid) {
		return (mid / x) + (mid / y) >= n - 1;
	}

}
