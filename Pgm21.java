package com.task;

public class Pgm21 {
	public static void main(String[] args) {
		byte a = 6, b = 3;
		int d = ++a - b;
		int q = a % b++;
		short s = a *= b + 5;
		byte c = 69 >>> 2;
		System.out.println("Value of 1=" + d);
		System.out.println("Value of 2=" + q);
		System.out.println("Value of 3=" + s);
		System.out.println("Value of 4=" + c);

	}

}
