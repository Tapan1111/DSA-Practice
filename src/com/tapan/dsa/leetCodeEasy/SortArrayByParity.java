package com.tapan.dsa.leetCodeEasy;

import java.util.Arrays;

public class SortArrayByParity {
	public static void main(String[] args) {
		SortArrayByParity sort = new SortArrayByParity();

		int[] nums = { 0, 1, 2, 3, 7, 4 };
		int[] ans = sort.sortArrayByParity(nums);
		System.out.println(Arrays.toString(ans));

	}

	public static int[] sortArrayByParity(int[] nums) {
		int s = 0;
		int e = nums.length - 1;
		while (s < e) {
			if (nums[s] % 2 != 0 && nums[e] % 2 == 0) {
				int temp = nums[s];
				nums[s] = nums[e];
				nums[e] = temp;
			}
			if (nums[s] % 2 == 0)
				s++;
			if (nums[e] % 2 != 0)
				e--;
		}
		return nums;

	}

}
