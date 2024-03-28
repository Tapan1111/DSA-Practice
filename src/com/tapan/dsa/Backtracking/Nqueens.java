package com.tapan.dsa.Backtracking;

public class Nqueens {
	public static void main(String[] args) {
		int n = 5;
		int[][] board = new int[n][n];

		queens(board, 0);
	}

	public static void queens(int[][] board, int row) {

		if (row == board.length) {
			printBoard(board);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isSafe(board, row, col)) {
				board[row][col] = 1;
				queens(board, row + 1);
				board[row][col] = 0;
			}
		}
	}

	private static boolean isSafe(int[][] board, int row, int col) {
		// check vertically
		for (int r = row; r >= 0; r--) {
			if (board[r][col] == 1)
				return false;
		}
		// check positive diagonal
		for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
			if (board[r][c] == 1)
				return false;
		}
		// check negative diagonal
		for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
			if (board[r][c] == 1)
				return false;
		}

		return true;
	}

	public static void printBoard(int[][] board) {
		System.out.println("-------------------------------------------------------");
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
	}

}
