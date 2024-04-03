package com.tapan.dsa.Sorting;

public class WordSearch {
	public static void main(String[] args) {

	}

	static boolean visited[][];

	public static boolean exist(char[][] board, String word) {
		int rows = board.length;
		int columns = board[0].length;

		visited = new boolean[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (board[i][j] == word.charAt(0) && searchword(i, j, 0, board, word)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean searchword(int i, int j, int index, char[][] board, String word) {
		if (index == word.length()) {
			return true;
		}
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)
				|| visited[i][j]) {
			return false;
		}
		visited[i][j] = true;
		if (searchword(i + 1, j, index + 1, board, word) || searchword(i - 1, j, index + 1, board, word)
				|| searchword(i, j + 1, index + 1, board, word) || searchword(i, j - 1, index + 1, board, word)) {
			return true;
		}
		visited[i][j] = false;
		return false;
	}

}
