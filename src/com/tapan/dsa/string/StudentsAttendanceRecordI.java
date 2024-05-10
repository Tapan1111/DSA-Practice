package com.tapan.dsa.string;

public class StudentsAttendanceRecordI {
	public static void main(String[] args) {
		String s = "LPLPLPLPLPL";
		System.out.println(checkRecord(s));
	}

	public static boolean checkRecord(String s) {
		int acount = 0;
		int lcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				acount++;
				if (acount >= 2) {
					return false;
				}
				lcount = 0;
			} else if (s.charAt(i) == 'L') {
				lcount++;
				if (lcount >= 3) {
					return false;
				}
			} else {
				lcount = 0;
			}
		}
		return true;
	}
}
