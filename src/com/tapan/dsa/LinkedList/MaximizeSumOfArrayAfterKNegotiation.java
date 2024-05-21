package com.tapan.dsa.LinkedList;

import java.util.PriorityQueue;

public class MaximizeSumOfArrayAfterKNegotiation {
	public static void main(String[] args) {
		int arr[] = { 4, 2, 3 };
		System.out.println(largetstSumAfterK(arr, 1));

	}

	public static int largetstSumAfterK(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int num : arr) {
			pq.add(num);
		}
		int negate = pq.remove() * -1;

		int sum = 0;
		pq.add(negate);
		while(pq.size() != 0) {
			sum = sum+pq.remove();
		}

		return sum;
	}

}
