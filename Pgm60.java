package com.task1;

public class Pgm60 {
	public static void main(String[] args) {
		int r = 0, n = 12;
		String binary = "";
		while (n > 0) {
			r = n % 2;
			binary = r + binary;
			n = n / 2;

		}
		System.out.println("binary value is =" + binary);
	}
	/*	int n = 1010;
		int d = 0, i = 0, r = 0;
		while (n > 0) {
			r = n % 10;
			d = (int) (d + (r * Math.pow(2, i)));
			n = n / 10;
			i++;
		}
		System.out.println("Decimal value is =" + d);
	}*/

}
