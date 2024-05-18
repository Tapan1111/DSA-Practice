package com.tapan.dsa.LinkedList;

public class MergeeKSortedLL {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static Node mergeKList(Node arr[], int last) {
		while (last != 0) {
			int i = 0;
			int j = last;
			while (i < j) {
				arr[i] = sortedMergeList(arr[i], arr[j]);
				i++;
				j--;
				if(i >= j) {
					last = j;
				}
			}
		}
		return arr[0];
	}


	private static Node sortedMergeList(Node node1, Node node2) {
		Node result = null;
		if (node1 == null) {
			return node2;
		}
		if (node2 == null) {
			return node1;
		}
		if (node1.data <= node2.data) {
			result = node1;
			result.next = sortedMergeList(node1.next, node2);
		} else {
			result = node2;
			result.next = sortedMergeList(node1, node2.next);
		}
		return result;
	}

	public static void printHead(Node node) {
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		int k = 3;
		int n = 4;

		Node[] arr = new Node[k];

		arr[0] = new Node(1);
		arr[0].next = new Node(3);
		arr[0].next.next = new Node(5);
		arr[0].next.next.next = new Node(7);

		arr[1] = new Node(2);
		arr[1].next = new Node(4);
		arr[1].next.next = new Node(6);
		arr[1].next.next.next = new Node(8);

		arr[2] = new Node(0);
		arr[2].next = new Node(9);
		arr[2].next.next = new Node(10);
		arr[2].next.next.next = new Node(11);
		
		Node head = mergeKList(arr, k - 1);
		printHead(head);
	}

	// BruteForce Solution of the kSortedLists question on LeetCode;
//	 public ListNode mergeKLists(ListNode[] lists) {
//	        if(lists == null || lists.length == 0){
//	            return null;
//	        }
//	        ListNode head = new ListNode(0);
//	        ListNode temp = head;
//	        ArrayList<Integer> l = new ArrayList<>();
//
//	        for(ListNode list : lists){
//	            while(list != null){
//	                l.add(list.val);
//	                list = list.next;
//	            }
//	        }
//	        Collections.sort(l);
//	        for(int val:l){
//	            temp.next = new ListNode(val);
//	            temp = temp.next;
//	        }
//	        return head.next;
//	        
//	    }

}
