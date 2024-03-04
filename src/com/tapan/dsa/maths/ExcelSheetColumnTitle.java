package com.tapan.dsa.maths;

public class ExcelSheetColumnTitle {
	public static void main(String[] args) {
		ExcelSheetColumnTitle sheet = new ExcelSheetColumnTitle();
		int cn = 78;
		System.out.println(sheet.convertToTitle(cn));

	}

//	public String convertToTitle(int columnNumber) {
//		StringBuffer res = new StringBuffer();
//		while (columnNumber > 0) {
//			int mod = columnNumber % 26;
//			res.append((char) (mod == 0 ? (90) : (mod + 64)));
//			columnNumber = columnNumber / 26;
//			if (mod == 0) {
//				columnNumber--;
//			}
//		}
//		return res.reverse().toString();
//	}
	public String convertToTitle(int n) {
		return n == 0 ? "" : convertToTitle((n - 1) / 26) + (char) ('A' + ((n - 1) % 26));

	}

}
