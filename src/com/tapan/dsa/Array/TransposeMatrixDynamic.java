package com.tapan.dsa.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransposeMatrixDynamic {
	public static void main(String[] args) {
		TransposeMatrixDynamic transposeMatrix = new TransposeMatrixDynamic();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				temp.add(sc.nextInt());
			}
			input.add(temp);
		}
		System.out.println(transposeMatrix.solve(input));

		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(input.get(i).get(j) + " ");
			}
			System.out.println();
		}
		


	}

	public static List<List<Integer>> solve(List<List<Integer>> input) {
		List<List<Integer>> ans = new ArrayList<>();
		int n = input.size();
		int m = input.get(0).size();
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				temp.add(input.get(j).get(i));
			}
			ans.add(temp);
		}
		return ans;

	}
}
