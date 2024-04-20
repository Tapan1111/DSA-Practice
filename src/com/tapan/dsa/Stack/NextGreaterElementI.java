package com.tapan.dsa.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementI {
	public static void main(String[] args) {
		int[] arr = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
		int[] res = nge(arr);
		System.out.println(Arrays.toString(res));

	}

	public static int[] nge(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				ans[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		return ans;
	}
}
