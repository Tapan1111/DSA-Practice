package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			System.out.println("Enter the columns :");
			for (int j = 0; j < 5; j++) {

				temp.add(sc.nextInt());
			}
			arr.add(temp);
		}
		arr.get(2).set(4, 6100);
		System.out.println(arr);
		System.out.println(arr.get(1).get(2));

	}

}
