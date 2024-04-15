package com.tapan.dsa.hashMap;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
	public static void main(String[] args) {
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(longestConsecutiveSubsequence(arr));
	}

	public static int longestConsecutiveSubsequence(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : arr) {
			set.add(num);
		}
		int maxLength = 0;
		for (int num : arr) {
			if (!set.contains(num - 1)) {
				int currNum = num;
				int currLength = 1;
				while (set.contains(currNum + 1)) {
					currNum += 1;
					currLength++;
				}
				maxLength = Math.max(maxLength, currLength);
			}
		}
		return maxLength;
	}

}
