package com.tapan.dsa.bitmanipulation;

public class KunalSingleNumber1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 3, 4, 2 };
		System.out.println(ans(arr));

	}

	private static int ans(int[] arr) {
		int unique = 0;
		for (int n : arr) {
			unique = unique ^ n;
		}
		return unique;
	}

}
