package com.tapan.dsa.Array;

public class DeleteArray {

	static int count = 5;

	public static void main(String[] args) {
		DeleteArray deleteArray = new DeleteArray();
		int[] a = { 12, 34, 45, 6, 13 };
		deleteArray.print(a);
//		deleteArray.deleteFromEnd(a);
//		deleteArray.print(a);
//		System.out.println();
//		deleteArray.deleteFromEnd(a);
//		deleteArray.print(a);

		System.out.println();
//		deleteArray.deleteTheValue(a, 4555);
//		deleteArray.print(a);

		deleteArray.deleteByPosition(a, 5);
		deleteArray.print(a);

	}

	public void deleteFromEnd(int[] arr) {
		if (arr.length <= 0) {
			return;
		}
		count--;
	}

	public void print(int[] arr) {
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void deleteTheValue(int[] arr, int val) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				break;
			}
		}

		if (i == count) {
			System.out.println("Value doesn't exist");
			return;
		}

		for (int j = i; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		count--;
	}

	public void deleteByPosition(int[] arr, int position) {
		if (position > count || position <= 0) {
			System.out.println("Invalid Position");
			return;
		}

		for (int i = position - 1; i < count - 1; i++) {
			arr[i] = arr[i + 1];
		}
		count--;
	}

}
