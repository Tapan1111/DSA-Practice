package com.tapan.dsa.BinarySearch;

public class AggressiveCowsBruteForceApproach {
	public static void main(String[] args) {
		int nCows = 3;
		int[] arr = { 1, 2, 4, 8, 9 };
		int N = arr.length;
		System.out.println(aggressiveCows(arr, nCows));

	}

	public static int aggressiveCows(int[] arr, int nCows) {
		int ans = -1;
		int mx = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mx) {
				mx = arr[i];
			}
		}

		for (int i = 0; i < mx; i++) {
			if (isOk(arr, i, nCows)) {
				ans = i;
			} else {
				break;
			}
		}
		return ans;
	}

	private static boolean isOk(int[] arr, int it, int nCows) {
		int n = arr.length;
		int count = 1;
		int d = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] - d >= it) {
				count++;
				d = arr[i];
			} else {
				continue;
			}
		}
		if (count >= nCows) {
			return true;
		}
		return false;
	}

}
