package com.tapan.dsa.LinkedList;

public class Main {
	public static void main(String[] args) {
		LL list = new LL();
		list.insertAtHead(4);
		list.insertAtHead(9);
		list.insertAtHead(87);
		list.insertAtHead(99);
		list.insertAtTail(77);
		list.insert(11, 3);
		list.display();
		System.out.println(list.deleteFirst());

		list.display();

	}

}
