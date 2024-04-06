package com.tapan.dsa.leetCodeEasy;

import java.util.Stack;

public class MakeTheStringGreat {
	public static void main(String[] args) {
		String s = "leEeetcode";
		System.out.println(makeGreat(s));
	}

	public static String makeGreat(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] arr = s.toCharArray();
		for (char curr : arr) {
			if (stack.size() == 0) {
				stack.push(curr);
			} else {
				char top = stack.peek();
				if (Character.toUpperCase(top) == Character.toUpperCase(curr)) {

					if (Character.isUpperCase(top) && Character.isLowerCase(curr)
							|| Character.isUpperCase(curr) && Character.isLowerCase(top)) {
						stack.pop();
					} else {
						stack.push(curr);
					}
				}
				else {
					stack.push(curr);
				}
			}
		}
		StringBuilder ans = new StringBuilder();
		while (stack.size() != 0) {
			ans.append(stack.pop());
		}

		return ans.reverse().toString();
	}
}
