package com.tapan.dsa.hashMap;

import java.util.Arrays;
import java.util.Stack;

public class NSE {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 5, 2, 25 };
		int[] res = nextSmallerArray(arr);
		System.out.println(Arrays.toString(res));
	}
	public static int[] nextSmallerArray(int[] arr) {
		int[] ans = new int[arr.length];
		Arrays.fill(ans, -1);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				ans[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		return ans;
	}

}
