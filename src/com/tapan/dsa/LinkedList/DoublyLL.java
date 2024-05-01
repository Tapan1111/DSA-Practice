package com.tapan.dsa.LinkedList;

public class DoublyLL {
	Node head;

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			super();
			this.data = data;
		}

		public Node(int data, Node next, Node prev) {
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

	}

}
