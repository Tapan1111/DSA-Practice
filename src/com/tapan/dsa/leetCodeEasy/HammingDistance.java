package com.tapan.dsa.leetCodeEasy;

public class HammingDistance {
	public static void main(String[] args) {
		int x = 4;
		int y = 14;
		System.out.println(countDistance(x, y));

	}

	public static int countDistance(int x, int y) {
		int xorResult = x ^ y;
		int count = 0;
		while (xorResult > 0) {
			xorResult = xorResult & (xorResult - 1);
			count++;
		}
		return count;
	}

}
