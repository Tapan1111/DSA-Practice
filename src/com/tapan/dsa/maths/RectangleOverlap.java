package com.tapan.dsa.maths;

public class RectangleOverlap {
	public static void main(String[] args) {
		RectangleOverlap rectangle = new RectangleOverlap();
		int[] rec1 = { 0, 0, 1, 1 };
		int[] rec2 = { 1, 0, 2, 1 };
		System.out.println(rectangle.isRectangleOverlap(rec1, rec2));

	}

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec2[0] < rec1[2] && rec2[1] < rec1[3];
	}

}
