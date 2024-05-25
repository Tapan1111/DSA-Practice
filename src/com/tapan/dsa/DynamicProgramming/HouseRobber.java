package com.tapan.dsa.DynamicProgramming;

public class HouseRobber {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 3, 1 };
		System.out.println(rob(arr));

	}

	public static int robber(int[] nums) {
		int n = nums.length;
		int[] strg = new int[n + 1];
		strg[0] = nums[0];
		strg[1] = nums[1];
		for (int i = 2; i < n; i++) {
			strg[i] = nums[i] + strg[i - 2];
		}
		int max = 0;
		for (int i = 0; i < strg.length; i++) {
			if (strg[i] > max) {
				max = strg[i];
			}
		}
		return max;

	}

	public static int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int robnext;
		int robnextPlusOne;
		robnextPlusOne = 0;
		robnext = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			int curr = Math.max(robnext, robnextPlusOne + nums[i]);
			robnextPlusOne = robnext;
			robnext = curr;
		}
		return robnext;

	}

}
