package com.tapan.dsa.leetCodeEasy;

import java.util.Arrays;

public class RunningSum {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] ans = new int[nums.length];
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum = sum + nums[i];
			ans[i] = sum;
		}
		System.out.println(Arrays.toString(ans));
	}
}
