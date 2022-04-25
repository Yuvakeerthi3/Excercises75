package com.task1;

public class Pgm61 {
	public static void main(String[] args) {
		int Oct = 15;
		int d = 0, i = 0, r = 0;
		while (Oct > 0) {
			r = Oct % 10;
			d = (int) (d + (r * Math.pow(8, i)));
			Oct = Oct / 10;
			i++;
		}
		System.out.println("Decimal value is =" + d);
	}
	/*int r = 0, n = 12;
	String binary = "";
	while (n > 0) {
		r = n % 8;
		binary = r + binary;
		n = n / 8;

	}
	System.out.println("Octadecimal value is =" + binary);
}*/

}
