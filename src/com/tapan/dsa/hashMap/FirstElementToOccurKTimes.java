package com.tapan.dsa.hashMap;

import java.util.HashMap;

public class FirstElementToOccurKTimes {
	public static void main(String[] args) {
		FirstElementToOccurKTimes first = new FirstElementToOccurKTimes();
		int[] arr = { 1, 7, 4, 3, 4, 8, 7 };
		int k = 2;
		System.out.println(first.countEquals(arr, k));
	}

	public int solve(int[] input, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = input.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (map.containsKey(input[i])) {
				count = map.get(input[i]);
			} else {
				count = 0;
			}
			map.put(input[i], count + 1);
			if (count + 1 == k) {
				return input[i];
			}
		}
		return -1;
	}

	public int countEquals(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (map.containsKey(arr[i])) {
				count = map.get(arr[i]);
			} else {
				count = 0;
			}
			map.put(arr[i], map.getOrDefault(arr[i], map.getOrDefault(arr[i], 0) + 1));
			if (count + 1 == k) {
				return arr[i];
			}
		}
		return -1;
	}

}
