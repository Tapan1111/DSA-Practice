package com.tapan.dsa.windowsliding;

public class FindMaximumOfAllSubArrayOfSizeK {
	public static void main(String[] args) {
		FindMaximumOfAllSubArrayOfSizeK find = new FindMaximumOfAllSubArrayOfSizeK();
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		System.out.println(find.sumMax(arr, k));

	}

//	public int getSum(int[] arr, int k) {
//		int ans = 0;
//		for (int i = 0; i < k; i++) {
//			int sum = 0;
//			for (int j = i; i < i + k; j++) {
//				sum = sum + arr[j];
//
//			}
//			ans = sum;
//			ans = Math.max(sum, ans);
//		}
//		return ans;
//	}

	public int sumMax(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		ans = sum;
		for (int j = k; j < arr.length; j++) {
			sum = sum + arr[j] - arr[j - k];
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
