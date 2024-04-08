package com.tapan.dsa.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {
	public static void main(String[] args) {
		int[] student = { 1, 1, 0, 0 };
		int[] sandwiches = { 0, 1, 0, 1 };
		System.out.println(countStudent(student, sandwiches));


	}

	public static int countStudent(int[] students, int[] sandwiches) {
		Arrays.sort(students);
		Arrays.sort(sandwiches);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = sandwiches.length - 1; i >= 0; i--) {
			stack.push(sandwiches[i]);


		}


		for (Integer val : students) {
			int top = stack.peek();
			if (top == val) {
				stack.pop();
			}
		}
		return stack.size();
	}

}
