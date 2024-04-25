package com.tapan.dsa.LinkedList;

public class LLImplementation {

	class LinkedList {

		class Node {
			int data;
			Node next;

			public Node(int data, Node next) {
				this.data = data;
				this.next = next;
			}
		}

		Node head;
		int size;

		public LinkedList() {
			size = 0;
		}

		public void add(int val) {
			if (head == null) {
				Node n = new Node(val, null);
				head = n;
				size = 1;
				return;
			}
			Node t = head;
			while (t.next != null) {
				t = t.next;

			}
			Node n = new Node(val, null);
			t.next = n;
			size++;
		}

		public Node get(int idx) {
			if (idx >= size) {
				return null;
			}
			Node t = head;
			int count = 0;
			while (count < idx) {
				t = t.next;
				count++;
			}
			return t;
		}
	}
}
