package com.tapan.dsa.windowsliding;

public class WindowSlidingConcept {
	public static void main(String[] args) {
		WindowSlidingConcept window = new WindowSlidingConcept();

		int[] arr = { 1, 5, 12, 1, 13, 3 };
		int target = 18;
		System.out.println(window.solve(arr, target));
	}

	public int solve(int[] arr, int target) {
		int tail = 0;
		int ans = 0;
		int sum = 0;
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum == target) {
				number = i - tail + 1;
			}
			ans = number;
			while (sum > target) {
				sum = sum - arr[tail];
				tail++;
			}
			ans = Math.max(ans, number);
		}

		return ans;
	}

}
