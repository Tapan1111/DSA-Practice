package com.tapan.dsa.leetcodeMedium;

public class FourDivisor {
	public static void main(String[] args) {
		FourDivisor divisor = new FourDivisor();
		int[] arr = { 21, 4, 7 };
		System.out.println(divisor.sumOfFourDivisor(arr));

	}

	public int sumOfFourDivisor(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
					sum = sum + j;
				}
				if (count == 4) {
					ans = ans + sum;
				}

			}
		}
		return ans;
	}

}
