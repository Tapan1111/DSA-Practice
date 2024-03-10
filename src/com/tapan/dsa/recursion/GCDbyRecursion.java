package com.tapan.dsa.recursion;

public class GCDbyRecursion {
	public static void main(String[] args) {
		
	}
	public static int gcd(int a, int b) {
		if(a%b == 0) {
			return a;
		}
		return gcd(a%b, a);
	}

}
