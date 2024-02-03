package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CellsWithOddValuesInMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> ans = new ArrayList<>();
		int m = 2;
		int n = 3;
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				temp.add(sc.nextInt());
			}
			ans.add(temp);
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
