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
		int idx = 0;
		for (int i = idx; i <= e; i++) {
			if (nums[s] == 0) {
				idx = idx + 1;
			}
			if (nums[idx] % 2 != 0 && nums[e] % 2 == 0) {
				int temp = nums[idx];
				nums[idx] = nums[e];
				nums[e] = temp;
			}
			s++;
			e--;

		}
		return nums;

	}

}
