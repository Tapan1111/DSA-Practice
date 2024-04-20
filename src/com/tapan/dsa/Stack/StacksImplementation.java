package com.tapan.dsa.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StacksImplementation {
	static class Stacks {
		private int[] arr;
		private int top;

		public Stacks(int size) {
			top = -1;
			arr = new int[size];
		}

		public void push(int ele) {
			if (top == arr.length - 1)
				throw new StackOverflowError();
			arr[++top] = ele;
		}

		public int pop() throws Exception {

			if (top == -1)
				throw new Exception("StackUnderflow");
			top--;
			return arr[top + 1];

		}

		public int peek() throws Exception {
			if (top == -1)
				throw new Exception("StackUnderflow");
			return arr[top];
		}

		public int size() {
			return top + 1;
		}

		public boolean isEmpty() {
			return this.size() == 0;
		}

		public void print() {
			System.out.println("-------------------");
			for (int i = 0; i <= top; i++) {

				System.out.println(arr[i] + "  ");
			}
			System.out.println();
			System.out.println("-------------------");
		}
	}

	public static void main(String[] args) throws Exception {
//		Stacks st = new Stacks(5);
//		st.push(34);
//		st.push(65);
//		st.push(87);
//		st.print();
//		System.out.println(st.size());
//		System.out.println(st.peek());
//		System.out.println(st.pop());
//		System.out.println(st.peek());
//		System.out.println(st.size());
//		System.out.println(st.isEmpty());
//		st.print();
		int[] arr = { 4, 8, 5, 2, 25 };
		int[] res = nextSmallerElementLeft(arr);
		System.out.println(Arrays.toString(res));

	}

	public static int[] nextSmallerElementRight(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				ans[stack.pop()] = arr[i];

			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		return ans;

	}

	public static int[] nextSmallerElementLeft(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				ans[stack.pop()] = arr[i];

			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		return ans;

	}

	public static int[] nextGreaterElementLeft(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				ans[stack.pop()] = arr[i];

			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		return ans;

	}

	public static int[] nextGreaterElementRight(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
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
