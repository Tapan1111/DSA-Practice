package com.tapan.dsa.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public static void main(String[] args) {
		String[] s = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(evaluateRPN(s));
	}

	public static int evaluateRPN(String[] s) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("+")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2 + op1);
			} else if (s[i].equals("-")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2 - op1);
			} else if (s[i].equals("*")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2 * op1);
			} else if (s[i].equals("/")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2 / op1);
			} else {
				stack.push(Integer.parseInt(s[i]));
			}
		}
		return stack.peek();
	}
}
