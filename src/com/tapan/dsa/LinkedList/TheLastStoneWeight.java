package com.tapan.dsa.LinkedList;

import java.util.Collections;
import java.util.PriorityQueue;

public class TheLastStoneWeight {
	public static void main(String[] args) {
		int[] arr = { 2, 2 };
		System.out.println(lastStoneWeight(arr));

	}

	public static int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < stones.length; i++) {
			pq.add(stones[i]);
		}

		while (pq.size() > 1) {
			int s1 = pq.remove();
			int s2 = pq.remove();
			if (s1 == s2) {
				pq.add(s1 - s2);
			}else {
				pq.add(s1 - s2);
			}
		}


		return pq.remove();

	}

}
