package com.tapan.dsa.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSum {
	public static void main(String[] args) {
		int[] nums1 = { 1, 7, 11 };
		int nums2[] = { 2, 4, 6 };
		int k = 3;
		System.out.println(kSmallestPairs(nums1, nums2, k));

	}

	public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//		int n = nums1.length;
//		int m = nums2.length;
//		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
//		HashSet<String> set = new HashSet<>();
//		List<List<Integer>> ans = new ArrayList<>();
//
//		if (n == 0 || m == 0 || k == 0)
//			return ans;
//
//		pq.add(new int[] { nums1[0] + nums2[0], 0, 0 });
//		set.add(0 + "," + 0);
//
//		while (!pq.isEmpty() && k-- > 0) {
//			int[] min = pq.poll();
//			int i = min[1];
//			int j = min[2];
//
//			ans.add(Arrays.asList(nums1[i], nums2[j]));
//
//			if (i + 1 < n && !set.contains((i + 1) + "," + j)) {
//				pq.add(new int[] { nums1[i + 1] + nums2[j], i + 1, j });
//				set.add((i + 1) + "," + j);
//			}
//			if (j + 1 < m && !set.contains(i + "," + (j + 1))) {
//				pq.add(new int[] { nums1[i] + nums2[j + 1], i, j + 1 });
//				set.add(i + "," + (j + 1));
//			}
//		}
//
//		return ans;
		int n = nums1.length;
		int m = nums2.length;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		HashSet<String> set = new HashSet<>();
		List<List<Integer>> ans = new ArrayList<>();
		if (n == 0 || m == 0 || k == 0) {
			return ans;
		}
		pq.add(new int[] { nums1[0] + nums2[0], 0, 0 });
		set.add(0 + "," + 0);
		while (!pq.isEmpty() && k-- > 0) {
			int[] min = pq.poll();
			int i = min[1];
			int j = min[2];
			ans.add(Arrays.asList(nums1[i], nums2[j]));
			if (i + 1 < n && !set.contains((i + 1) + "," + j)) {
				pq.add(new int[] { nums1[i + 1] + nums2[j], i + 1, j });
				set.add((i + 1) + "," + j);
			}
			if (j + 1 < m && !set.contains(i + "," + (j + 1))) {
				pq.add(new int[] { nums1[i] + nums2[j + 1], i, j + 1 });
				set.add(i + "," + (j + 1));
			}
		}
		return ans;
	}

}
