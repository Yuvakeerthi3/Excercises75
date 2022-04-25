package com.task1;

public class Pgm58 {
	int fact = 1;

	int factorial(int num) {
		fact = fact * num;
		num--;
		if (num > 0) {
			factorial(num);
		}
		return fact;
	}

	public static void main(String[] args) {
		Pgm58 fac = new Pgm58();
		int factor = fac.factorial(5);
		System.out.println("FACTORIAL OF A NUMbER =" + factor);
	}

}
