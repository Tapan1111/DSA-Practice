package com.tapan.dsa.bitmanipulation;

import java.util.HashMap;

public class SingleNumberII {
	public static void main(String[] args) {
		int[] arr = { 5, 5, 5, 1, 4, 4, 4 };
		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : arr) {
			if (map.get(num) == 1) {
				return num;
			}
		}
		return -1;
	}

}
