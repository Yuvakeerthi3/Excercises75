package com.task1;

public class Pgm64 {
	static int power(int base, int powerraised) {
		if (powerraised == 0) {
			return 1;
		} else
			return (base * power(base, powerraised - 1));
	}

	public static void main(String[] args) {
		int base = 3, powerraised = 2;
		int result = power(base, powerraised);
		System.out.println(base + "^" + powerraised + "=" + result);
	}

}
