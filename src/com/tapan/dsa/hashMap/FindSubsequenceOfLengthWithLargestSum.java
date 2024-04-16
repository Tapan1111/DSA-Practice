package com.tapan.dsa.hashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class FindSubsequenceOfLengthWithLargestSum {
	public static void main(String[] args) {
		int[] arr = { -1, -2, 3, 4 };
		int k = 3;
		int res[] = maxSubsequence(arr, k);
		System.out.println(Arrays.toString(res));

	}

	public static int[] maxSubsequence(int[] arr, int k) {
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
		for (int i = 0; i < arr.length; i++) {
			pq.offer(new int[] { arr[i], i });
			if (pq.size() > k) {
				pq.poll();
			}
		}
		HashSet<Integer> set = new HashSet<Integer>();
		while (!pq.isEmpty()) {
			int[] top = pq.poll();
			set.add(top[1]);
		}

		int[] ans = new int[k];
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(i)) {
				ans[p++] = arr[i];
			}
		}
		return ans;
	}

}
