package com.tapan.dsa.leetCodeEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		int rows = 3;
		int cols = 3;

		for (int i = 0; i < rows; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < cols; j++) {
				temp.add(sc.nextInt());
			}
			matrix.add(temp);
		}

		for (int i = 0; i < rows; i++) {
			ArrayList<Integer> column = new ArrayList<Integer>();
			for (int j = 0; j < cols; j++) {
				column.add(matrix.get(i).get(rows - j - 1));
			}
			matrix.add(column);
		}
		System.out.println(matrix);

//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(matrix.get(i).get(j));
//			}
//			System.out.println();
//		}

		int sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j || i + j == rows - 1) {
					sum = sum + matrix.get(i).get(j);
				}
			}
		}
		System.out.println("The Diagonal sum is : " + sum);


	}


}
