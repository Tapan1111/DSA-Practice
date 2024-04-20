package com.tapan.dsa.Stack;

import java.util.Stack;

public class DuplicateBracket {
	public static void main(String[] args) {
		String s = "(a+(b)/c)";
		System.out.println(check(s));

	}

	public static boolean check(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ')') {
				if (stack.peek() == '(') {
					return true;
				} else {
					while (stack.peek() != '(') {
						stack.pop();
					}
					stack.pop();
				}
			} else {
				stack.push(ch);
			}
		}
		return true;
	}

}
