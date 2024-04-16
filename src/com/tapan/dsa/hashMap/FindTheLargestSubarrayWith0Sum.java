package com.tapan.dsa.hashMap;

import java.util.HashMap;

public class FindTheLargestSubarrayWith0Sum {
	public static void main(String[] args) {
		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(maxLen(arr));
	}

	public static int maxLen(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int pSum = 0;
		int ans = 0;
		map.put(0, -1);
		for (int i = 0; i < arr.length; i++) {
			pSum = pSum + arr[i];
			if (map.containsKey(pSum)) {
				ans = Math.max(ans, i - map.get(pSum));
			} else {
				map.put(pSum, i);
			}
		}
		return ans;
	}

}
