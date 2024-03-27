package com.tapan.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 1, 4 };
		System.out.println(solve(arr));
	}

	public static List<List<Integer>> solve(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		subset2(ans, new ArrayList<Integer>(), arr, 0);
		return ans;
	}

	private static void subset2(List<List<Integer>> ans, ArrayList<Integer> arrayList, int[] arr, int start) {
		if (ans.contains(arrayList)) {
			return;
		}

		ans.add(new ArrayList<Integer>(arrayList));
		for (int i = start; i < arr.length; i++) {
			if (i > start && arr[i] == arr[i - 1]) {
				continue;
			}
			arrayList.add(arr[i]);
			subset2(ans, arrayList, arr, i + 1);
			arrayList.remove(arrayList.size() - 1);
		}
	}
}
