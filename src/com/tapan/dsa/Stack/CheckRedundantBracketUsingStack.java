package com.tapan.dsa.Stack;

import java.util.Stack;

public class CheckRedundantBracketUsingStack {
	public static void main(String[] args) {
		String s = "((a+b))";
		System.out.println(checkRedundant(s));

	}

	public static boolean checkRedundant(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] str = s.toCharArray();
		for (char ch : str) {
			if (ch == ')') {
				char top = stack.peek();
				stack.pop();
				boolean flag = true;
				while (top != '(') {
					if (top == '+' || top == '-' || top == '*' || top == '/') {
						flag = false;
					}
					top = stack.peek();
					stack.pop();
				}

				if (flag == true) {
					return true;
				}
			} else {
					stack.push(ch);
				}

		}
		return false;
	}

}
