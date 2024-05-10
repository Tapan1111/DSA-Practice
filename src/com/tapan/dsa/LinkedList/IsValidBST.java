package com.tapan.dsa.LinkedList;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class IsValidBST {

	public static int maxValue(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int value = node.data;
		int maxLeft = maxValue(node.left);
		int maxright = maxValue(node.right);
		return Math.max(value, Math.max(maxLeft, maxright));
	}

	public static int minValue(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int value = node.data;
		int minLeft = maxValue(node.left);
		int minright = maxValue(node.right);
		return Math.max(value, Math.min(minLeft, minright));
	}

	public static boolean isValid(Node node) {
		if (node == null) {
			return true;
		}
		if (node.left != null && maxValue(node.left) > node.data) {
			return false;
		}
		if (node.right != null && minValue(node.right) < node.data) {
			return false;
		}
		if (isValid(node.left) == false || isValid(node.right) == false) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		if (isValid(root)) {
			System.out.println(" valid");
		} else {
			System.out.println("not valid");
		}
	}
}

