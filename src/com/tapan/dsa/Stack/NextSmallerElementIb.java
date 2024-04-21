package com.tapan.dsa.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextSmallerElementIb {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		System.out.println(check(arr));


	}

	public static ArrayList<Integer> check(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();

			}
			if (stack.isEmpty()) {
				ans.add(-1);
			} else {
				ans.add(stack.peek());
			}
			stack.push(arr[i]);
		}
		return ans;
	}


}
