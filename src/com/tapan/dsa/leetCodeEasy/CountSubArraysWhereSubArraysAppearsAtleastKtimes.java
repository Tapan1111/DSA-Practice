package com.tapan.dsa.leetCodeEasy;

import java.util.ArrayList;

public class CountSubArraysWhereSubArraysAppearsAtleastKtimes {
	public static void main(String[] args) {
		int[] arr = { 28, 5, 58, 91, 24, 91, 53, 9, 48, 85, 16, 70, 91, 91, 47, 91, 61, 4, 54, 61, 49 };
		int target = 1;
		System.out.println(countSubArray(arr, target));
	}

	public static long countSubArray(int[] arr, int target) {
		long count = 0;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for (int k = i; k <= j; k++) {
					temp.add(arr[k]);
				}

				ans.add(temp);
			}

		}

		for (ArrayList<Integer> val : ans) {
			long cnt = 0;
			int max = val.get(0);
			for (int num : val) {
				if (num > max) {
					max = num;
					cnt = 1;
				} else if (num == max) {
					cnt++;
				}
			}
			if (cnt >= target) {
				count++;
			}
		}


		return count;
	}
}
