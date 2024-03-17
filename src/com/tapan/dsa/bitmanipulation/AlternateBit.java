package com.tapan.dsa.bitmanipulation;

public class AlternateBit {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(solve(n));

	}

	public static boolean solve(int n) {
		int c = (n ^ (n >> 1));
		int k = c & (c + 1);
		if (k == 0) {
			return true;
		}
		return false;
	}

}
