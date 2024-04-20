package com.tapan.dsa.Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] res = nextGElement(nums1, nums2);
		System.out.println(Arrays.toString(res));

	}

	public static int[] nextGElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		Arrays.fill(ans, -1);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums2.length; i++) {
			map.put(nums2[i], i);
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = nums1.length - 1; i >= 0; i--) {
			int val = map.get(nums1[i]);
			while (!stack.isEmpty() && nums1[stack.peek()] > nums2[val]) {
				ans[stack.pop()] = nums2[val];
			}
			stack.push(i);
		}
		return ans;
	}

}
