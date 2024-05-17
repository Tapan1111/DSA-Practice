package com.tapan.dsa.maths;

public class GcdUnacademy {
	public static void main(String[] args) {
		System.out.println(solvegcd(24, 60));

	}

	// Brute force way
	public static int solve(int x, int y) {
		int z = Math.min(x, y);
		int ans = 0;
		for (int i = 2; i <= z; i++) {
			if (x % i == 0 && y % i == 0) {
				ans = i;
			}
		}
		return ans;
	}

	public static int solvegcd(int x, int y) {
		int z = Math.min(x, y);
		int ans = 0;
		for (int i = 2; i <= x; i++) {
			if (x % i == 0 && y % i == 0) {
				ans = i;
			}
		}
		return ans;
	}

}
