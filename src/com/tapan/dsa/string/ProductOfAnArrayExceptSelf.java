package com.tapan.dsa.string;

import java.util.Arrays;

public class ProductOfAnArrayExceptSelf {
	public static void main(String[] args) {
		ProductOfAnArrayExceptSelf product = new ProductOfAnArrayExceptSelf();
		int[] nums = { 1, 2, 3, 4 };
		int[] res = product.solve(nums);
		System.out.println(Arrays.toString(res));

	}

	public int[] solve(int[] arr) {
		int n = arr.length;
		int[] prefix = new int[n];
		int[] suffix = new int[n];

		prefix[0] = 1;
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] * arr[i - 1];
		}
		suffix[suffix.length - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * arr[i + 1];
		}
		int[] ans = new int[n];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = prefix[i] * suffix[i];
		}
		return ans;
	}
}
