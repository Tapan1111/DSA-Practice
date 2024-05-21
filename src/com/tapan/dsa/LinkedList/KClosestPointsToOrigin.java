package com.tapan.dsa.LinkedList;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	public static void main(String[] args) {


	}

	public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
				(a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

		for (int i = 0; i < points.length; i++) {
			pq.add(points[i]);
			if (pq.size() > k) {
				pq.remove();
			}
		}
		int[][] result = new int[k][2];
		int i = 0;
		while (!pq.isEmpty()) {
			result[i] = pq.remove();
			i++;
		}


		return result;

	}
}
