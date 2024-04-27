package com.tapan.dsa.LinkedList;

public class LL {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size = 0;
	}

	public void insertAtTail(int val) {
		if (tail == null) {
			insertAtHead(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}

	public void insert(int val, int index) {
		if(index == 0) {
			insertAtHead(val);
			return;
		}
		if (index == size) {
			insertAtTail(val);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;

	}

	public int deleteFirst() {
		int val = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("end");
	}

	public void insertAtHead(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

}
