package com.tapan.dsa.Array;

public class InsertArray {

	int count = 0;

	public static void main(String[] args) {

		InsertArray o = new InsertArray();
		int[] arr = new int[10];
//		arr[0] = 11;
//		arr[1] = 22;
//		arr[2] = 33;
//		arr[3] = 44;  
//		arr[4] = 55;
		for (int j = 0; j < arr.length; j++) {
			o.insert(arr, j + 1);

		}
		o.print(arr);
		o.insertAt(arr, 567);
		o.insertAt(arr, 11);
		System.out.println();
		o.print(arr);

		System.out.println();

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//
//		for (int j = 0; j < arr.length; j++) {
//			arr[j] = j;
//			System.out.print(arr[j] + " ");
//		}


	}

	public void insert(int[] arr, int val) {
		arr[count++] = val;
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void insertAt(int[] arr, int val) {
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = val;
	}


}
