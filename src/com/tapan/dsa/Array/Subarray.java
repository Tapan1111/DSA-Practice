package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.List;

public class Subarray {
	// product of subsets less than the target.
	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 6 };
		int target = 100;
		System.out.println(solve(arr, target));
		// printSubArray(arr);
		// System.out.println();
	}

//	public static void printSubArray(int[] arr) {
//		int n = arr.length;
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				for (int k = i; k <= j; k++) {
//					System.out.print(arr[k] + " ");
//				}
//				System.out.println();
//			}
//		}
//	}
	public static List<List<Integer>> solve(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		subarray(ans, new ArrayList<>(), arr, 0, target, 1);
		return ans;

	}

	private static void subarray(List<List<Integer>> ans, ArrayList<Integer> temp, int[] arr, int start, int target,
			int product) {
		if (!temp.isEmpty() && product < target) {
			ans.add(new ArrayList<Integer>(temp));
		}

		if (start == arr.length || product >= target) {
			return; // End of array, stop recursion
		}


		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			subarray(ans, temp, arr, i + 1, target, product * arr[i]);
			temp.remove(temp.size() - 1);
		}
	}

}
