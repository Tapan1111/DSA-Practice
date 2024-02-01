package com.tapan.dsa.Array;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();

		int[][] first = new int[r1][c1];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				first[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				System.out.print(first[i][j] + "  ");
			}
			System.out.println();
		}
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int[][] second = new int[r2][c2];
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				second[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				System.out.print(second[i][j] + "  ");
			}
			System.out.println();
		}

		if (c1 != r2) {
			System.out.println("Invalid Matrix!");
		}
		int[][] multipleMatrix = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for(int k=0; k<c1; k++) {
					multipleMatrix[i][j] += first[i][k] * second[k][j];
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				System.out.print(multipleMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
