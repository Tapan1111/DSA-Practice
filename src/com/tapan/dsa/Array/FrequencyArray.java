package com.tapan.dsa.Array;

public class FrequencyArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 2, 3, 1 };
		int[] freqArr = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freqArr[j] = visited;
				}
				if (freqArr[i] != visited) {
					freqArr[i] = count;
				}
			}
		}

		for (int i = 0; i < freqArr.length; i++) {
			if (freqArr[i] != visited) {
				System.out.println(arr[i] + " | " + freqArr[i]);
			}
		}
	}

}
