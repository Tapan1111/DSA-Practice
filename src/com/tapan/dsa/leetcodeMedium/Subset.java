package com.tapan.dsa.leetcodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Subset {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(solve(arr));
	}

	public static List<List<Integer>> solve(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		int n = arr.length;
		for (int i = 0; i < (1 << n); i++) {
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					temp.add(arr[j]);
				}
			}
			ans.add(temp);
		}
		return ans;
	}

}
