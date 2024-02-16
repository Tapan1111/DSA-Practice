package com.tapan.dsa.maths;

public class Pow {
	public static void main(String[] args) {
		Pow power = new Pow();
		System.out.println(power.solve(12, 3));

	}

	public int solve(int x, int n) {
		int ans = 1;
		for (int i = 0; i < n; i++) {
			ans = ans * x;
		}
		return ans;
	}
}
