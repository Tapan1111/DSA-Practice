package com.tapan.dsa.Array;

import java.util.Scanner;

public class RichestWealth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows:");
		int row = sc.nextInt();
		System.out.println("Enter rows:");
		int col = sc.nextInt();
		int max = 0;
		int[][] bank = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				bank[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum = sum + bank[i][j];
			}
//			System.out.println(sum);
			if (sum > max) {
				max = sum;
			}
			System.out.println(max);
		}


		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(bank[i][j] + " ");
			}
			System.out.println();
		}
	}

}
