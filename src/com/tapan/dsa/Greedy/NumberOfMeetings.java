package com.tapan.dsa.Greedy;

import java.util.Arrays;

public class NumberOfMeetings {
	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 6, 7, 9, 9 };
		System.out.println(maxMeetings(start, end, 6));

	}

	static class Pair {
		int start;
		int end;

		public Pair(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static int maxMeetings(int start[], int end[], int n) {
		Pair[] meetings = new Pair[n];
		for (int i = 0; i < n; i++) {
			meetings[i] = new Pair(start[i], end[i]);
		}
		Arrays.sort(meetings, (a, b) -> a.end - b.end);
		System.out.println(Arrays.toString(meetings));
		int count = 0;
		int lastEnd = 0;
		for (int i = 0; i < n; i++) {
			if (meetings[i].start > lastEnd) {
				count++;
				lastEnd = meetings[i].end;
			}
		}
		return count;

	}

}
