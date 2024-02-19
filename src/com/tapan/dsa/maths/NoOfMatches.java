package com.tapan.dsa.maths;

public class NoOfMatches {
	public static void main(String[] args) {
		NoOfMatches matchesplayed = new NoOfMatches();

		int n = 7;
		System.out.println(matchesplayed.matches(n));

	}

	public int matches(int n) {
		int matchCount = 0;
		while (n > 1) {
			matchCount = matchCount + (n / 2);
			if (n % 2 != 0) {
				n = n / 2 + 1;
			} else {
				n = n / 2;
			}
		}
		return matchCount;
	}
}
