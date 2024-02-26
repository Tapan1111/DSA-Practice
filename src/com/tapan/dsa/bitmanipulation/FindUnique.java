package com.tapan.dsa.bitmanipulation;

public class FindUnique {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 5, 3, 2, 1, 4 };
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		int unique = 0;
		for (int val : arr) {
			unique = unique ^ val;
		}
		return unique;
	}

}
