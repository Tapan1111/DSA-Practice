package com.tapan.dsa.windowsliding;

public class PrintingAllSubArrays {
	public static void main(String[] args) {
		PrintingAllSubArrays subArray = new PrintingAllSubArrays();

		int[] arr = { 1, 2, 3, 4, 5 };
//		System.out.println(subArray.subArray(arr));
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
				}
				ans = Math.max(ans, sum);
			}
		}
		System.out.print(ans);
		System.out.println();

	}

//	public int subArray(int[] arr) {
//		int maxSum = arr[0];
//		int currentSum = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			currentSum = Math.max(arr[i], currentSum + arr[i]);
//			maxSum = Math.max(maxSum, currentSum);
//		}
//		return maxSum;
//	}
}
