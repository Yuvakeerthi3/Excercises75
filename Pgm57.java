package com.task1;

public class Pgm57 {
	int total = 0;

	int sum(int n) {
		total = total + n;
		n--;
		if (n > 0) {
			sum(n);
}
		return total;
	}
public static void main(String[] args) {
		Pgm57 add = new Pgm57();
		int result = add.sum(10);
		System.out.println("ADDITION OF TEN NUMbER =" + result);
	}
}
