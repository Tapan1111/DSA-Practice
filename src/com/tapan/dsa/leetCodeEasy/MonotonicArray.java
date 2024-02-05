package com.tapan.dsa.leetCodeEasy;

public class MonotonicArray {
	public static void main(String[] args) {
		MonotonicArray monotonicArray = new MonotonicArray();

		int[] nums = { 1, 3, 4, 3 };
		System.out.println(monotonicArray.isMonotomic(nums));

	}

	public static boolean isMonotomic(int[] arr) {
		boolean flag = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			return flag;
		} else {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] > arr[j - 1]) {
					flag = false;
					break;
				}
			}
		}

		return flag;

	}

}
