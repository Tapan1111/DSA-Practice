package com.tapan.dsa.leetCodeEasy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 1, 2 };
		KidsWithGreatestNumberOfCandies candy = new KidsWithGreatestNumberOfCandies();
		System.out.println(candy.solve(arr, 1));

	}

	public static List<Boolean> solve(int[] arr, int extraCandies) {
		List<Boolean> ans = new ArrayList<Boolean>();
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (Integer val : arr) {
			if (val + extraCandies >= max) {
				ans.add(true);
			} else {
				ans.add(false);
			}

		}
		return ans;
	}
}
