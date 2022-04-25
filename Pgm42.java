package com.task1;

public class Pgm42 {
	public static void main(String[] args) {
		int x = 45, y = 5, gcd = 1;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of number =" + gcd);
	}
}
