package com.tapan.dsa.LinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Treee {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static void levelOrder(Node root) {

		Queue<Node> q = new LinkedList<>();
		Node node = root;
		q.add(node);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.println(curr.data);
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}

	}

	public static void InOrderUsingStack(Node root) {
		Stack<Node> st = new Stack<>();
		Node curr = root;
		while (curr != null || st.size() > 0) {
			while (curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			System.out.println(curr.data);
			curr = curr.right;
		}
	}

	public static void InPreUsingStack(Node root) {
		Stack<Node> st = new Stack<>();
		Node curr = root;
		while (curr != null || st.size() > 0) {
			while (curr != null) {
				System.out.println(curr.data);
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			curr = curr.right;

		}
	}

	public static void InPostUsingStack(Node root) {
		Stack<Node> stack = new Stack<>();
		while (true) {
			while (root != null) {
				stack.push(root);
				stack.push(root);
				root = root.left;
			}

			// Check for empty stack
			if (stack.empty())
				return;
			root = stack.pop();

			if (!stack.empty() && stack.peek() == root)
				root = root.right;

			else {

				System.out.print(root.data + " ");
				root = null;
			}
		}
	}
	public static void printInOrder(Node root) {
		if (root == null) {
			return;
		}
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}

	public static void printPreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		printInOrder(root.left);

		printInOrder(root.right);
	}

	public static void printPostOrder(Node root) {
		if (root == null) {
			return;
		}
		printInOrder(root.left);

		printInOrder(root.right);
		System.out.println(root.data);
	}

	public static void levelOrderprint(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.println(curr.data);
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}
	}
	public static void main(String[] args) {
		Node n10 = new Node(10);
		Node n20 = new Node(20);
		Node n50 = new Node(50);
		Node n40 = new Node(40);
		Node n60 = new Node(60);
		Node n30 = new Node(30);
		Node n70 = new Node(70);
		Node n80 = new Node(80);
		Node n90 = new Node(90);

		n10.left = n20;
		n10.right = n50;
		n20.left = n40;
		n20.right = n60;

		n60.left = n80;
		n50.left = n30;
		n50.right = n70;
		n30.right = n90;

		levelOrder(n10);

	}

}
