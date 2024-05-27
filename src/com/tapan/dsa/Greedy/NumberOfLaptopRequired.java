package com.tapan.dsa.Greedy;

import java.util.Arrays;

public class NumberOfLaptopRequired {
	public static void main(String[] args) {
		int[] start = { 1, 3, 1, 4, 5, 1, 2, 1, 2 };
		int[] end = { 5, 10, 2, 7, 9, 3, 3, 2, 5 };
		System.out.println(minLaptops(9, start, end));
	}

	public static class Pair{
        int start;
        int end;
        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
	}

	public static int minLaptops(int N, int[] start, int[] end) {
		Arrays.sort(start);
		Arrays.sort(end);
		int count = 0;
		int ans = 0;
		int i = 0;
		int j = 0;
		while (i < N) {
			if (start[i] < end[j]) {
				count++;
				ans = Math.max(ans, count);
				i++;
			} else {
				count--;
				j++;
			}
        }
		return ans;

    }
}
