package com.tapan.dsa.leetCodeEasy;

public class MaximumConsecutiveOnes {
	public static void main(String[] args) {
		MaximumConsecutiveOnes maximum = new MaximumConsecutiveOnes();
		int[] arr = { 1, 0, 1, 1, 0, 1, 0 };
		System.out.println(maximum.solution(arr));
	}

	public int solution(int[] arr) {
		int n = arr.length;
		int count = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			ans = Math.max(ans, count);
		}

		return ans;
	}

}
