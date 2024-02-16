package com.tapan.dsa.windowsliding;

public class MaximumSubArray {
	public static void main(String[] args) {
		MaximumSubArray max = new MaximumSubArray();

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(max.maxSubarray(nums));
	}

	public int maxSubarray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);

			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
