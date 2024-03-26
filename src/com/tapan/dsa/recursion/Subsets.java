package com.tapan.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(subset(arr));

	}

	public static List<List<Integer>> subset(int[] arr) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		backtrack(ans, new ArrayList<Integer>(), arr, 0);
		return ans;
	}

	private static void backtrack(List<List<Integer>> ans, ArrayList<Integer> temp, int[] arr, int start) {

		ans.add(new ArrayList<Integer>(temp));
		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			backtrack(ans, temp, arr, i + 1);
			temp.remove(temp.size() - 1);
		}

	}
}
