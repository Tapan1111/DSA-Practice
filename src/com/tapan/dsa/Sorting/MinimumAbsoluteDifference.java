package com.tapan.dsa.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 3 };
		System.out.println(minabsDiff(arr));
	}

	public static List<List<Integer>> minabsDiff(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		int mindiff = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			mindiff = Math.min(arr[i] - arr[i - 1], mindiff);
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] == mindiff) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(arr[i - 1]);
				temp.add(arr[i]);
				ans.add(temp);
			}
		}
		return ans;
	}

}
