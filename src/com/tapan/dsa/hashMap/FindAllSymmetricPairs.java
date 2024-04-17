package com.tapan.dsa.hashMap;

public class FindAllSymmetricPairs {
	public static void main(String[] args) {
		int arr[][] = { { 11, 20 }, { 30, 40 }, { 5, 10 }, { 40, 30 }, { 10, 5 } };
		findSymmetric(arr, 5);

	}

	public static void findSymmetric(int[][] arr, int row) {
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < row; j++) {
				if (arr[i][0] == arr[j][1] && arr[j][0] == arr[i][1]) {
					System.out.print("(");
					System.out.print(arr[i][0]);
					System.out.print(", ");
					System.out.print(arr[i][1]);
					System.out.print(")");
					System.out.print("\n");
				}
			}
		}

	}

}
