package com.tapan.dsa.bitmanipulation;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(solve(n));
	}
	public static boolean solve(int n) {
		if (n == 0 || (n & (n - 1)) != 0) {
			return false;
		}
		return true;
	}

}
