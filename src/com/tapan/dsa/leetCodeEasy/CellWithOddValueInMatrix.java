package com.tapan.dsa.leetCodeEasy;

import java.util.ArrayList;
import java.util.List;

public class CellWithOddValueInMatrix {
	public static void main(String[] args) {
		CellWithOddValueInMatrix cell = new CellWithOddValueInMatrix();
		cell.solve(2, 3);


	}

	public static void solve(int m, int n) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		for (int i = 0; i < m; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				temp.add(0);
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
