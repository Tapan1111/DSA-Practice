package com.tapan.dsa.Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
	public static void main(String[] args) {
		int[] ans = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] res = dailyTemperatures(ans);
		System.out.println(Arrays.toString(res));

	}

	public static int[] dailyTemperatures(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				int prevIndex = stack.pop();
				answer[prevIndex] = i - prevIndex;
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			answer[stack.pop()] = 0;
		}
		return answer;
	}

}
