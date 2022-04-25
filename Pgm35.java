package com.task;

public class Pgm35 {
	public static void main(String[] args) {
		int a = 2, b = 4, c = 2;
		int p = (b * b) - (4 * a * c);
		int q = 2 * a;
		float r = (float) Math.sqrt(p);
		float x1 = (float) (-b + r) / q;
		float x2 = (float) (-(-b + r)) / q;
		System.out.println("Value of Determinant=" + p);
		System.out.println("Square root of Determinant=" + r);
		System.out.println("value of x1=" + x1);
		System.out.println("value of x2=" + x2);
		if (p == 0) {
			System.out.println("Roots are real and equal");
		} else if (p > 0) {
			System.out.println("Roots are real and unequal");
		} else if (p < 0) {
			System.out.println("Roots are complex and equal");
		}

	}
}
