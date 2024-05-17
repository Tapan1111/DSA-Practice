package com.tapan.dsa.LinkedList;

import java.util.ArrayList;

public class MaxHeap {
	ArrayList<Integer> heap;

	public MaxHeap() {
		heap = new ArrayList<Integer>();
	}

	public void insert(int elem) {
		heap.add(elem);
		upheapify(heap.size() - 1);
	}

	private void upheapify(int idx) {
		int pi = (idx - 1) / 2;
		if (heap.get(idx) > heap.get(pi)) {
			swap(pi, idx);
		}

	}

	private void swap(int pi, int idx) {
		int temp = heap.get(pi);
		heap.set(pi, heap.get(idx));
		heap.set(idx, temp);
		
	}

	public static void main(String[] args) {
		MaxHeap m = new MaxHeap();
		m.heap(1, 2, 3, 4, 5);

	}

	private void heap(int i, int j, int k, int l, int m) {
		heap.add(i);
		heap.add(j);
		heap.add(k);
		heap.add(l);
		heap.add(m);
		heap.add(44);
		System.out.println(heap);

	}

}
