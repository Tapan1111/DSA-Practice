package com.tapan.dsa.leetcodeMedium;

public class NumberOfSubarraysWithGcdEqualsToK {
	public static void main(String[] args) {
		int[] arr = { 9, 3, 1, 2, 6, 3 };
		int k = 3;
		System.out.println(subarrayGCD(arr, k));

	}

	public static int subarrayGCD(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int currentGcd = arr[i];
			if (currentGcd == k) {
				count++;
			}
			for (int j = i + 1; j < arr.length; j++) {
				currentGcd = gcd1(currentGcd, arr[j]);
				if (currentGcd == k) {
						count++;
				}
				else if (currentGcd == 1) {
					break;
				}
			}
		}
		return count;
	}



	public static int gcd1(int a, int b) {
		int rem = a % b;
		while (rem != 0) {
			a = b;
			b = rem;
			rem = a % b;
		}
		return b;
	}

}
