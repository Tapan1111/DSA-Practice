package com.tapan.dsa.leetCodeEasy;

import java.util.Stack;

public class MinimumRemovalToMakeValidParenthese {

	public static void main(String[] args) {
		String s = "lee(t(c)o)de)";
		System.out.println(makeValid(s));

	}

	public static String makeValid(String s) {
		char[] arr = s.toCharArray();
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == '(') {
				stack.push(i);
			}
			else if (arr[i] == ')' && !stack.isEmpty()) {
				stack.pop();
			}else if (arr[i] == ')') {
				arr[i] = ' ';
			}
		}
		while (!stack.isEmpty()) {
			int idx = stack.pop();
			arr[idx] = ' ';
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : arr) {
			if (ch != ' ') {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
