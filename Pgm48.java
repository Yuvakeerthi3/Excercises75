package com.task1;

public class Pgm48 {
	public static void main(String[] args) {
		int n = 414, r = 0, sum = 0;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("PALINDROME NUMbER");
		} else {
			System.out.println("NOT A PALINDROME NUMbER");

		}

	}

}
