package com.tapan.dsa.twoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashMap {
	public static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int req = target - arr[i];
			if (map.containsKey(req)) {
				return new int[] { map.get(req), i };
			}
			map.put(arr[i], i);
		}
		throw new IllegalArgumentException("target sum does not exsist");
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		int[] res = twoSum(arr, 6);
		System.out.println(Arrays.toString(res));

	}

}
