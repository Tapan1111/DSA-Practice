package com.tapan.dsa.leetcodeMedium;

public class MaxChunkToMakeSorted {
	public static int maxChunk(int[] arr) {
		int maxNum = 0;
		int chunkCount = 0;
		for (int val : arr) {
			maxNum = Math.max(maxNum, val);
			if (maxNum == val) {
				chunkCount++;
			}
		}

		return chunkCount;
	}
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1, 0 };
		System.out.println(maxChunk(arr));

	}

}
