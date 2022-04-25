package com.task1;

import java.util.Scanner;

public class Pgm47 {
	public static void main(String[] args) {
		Scanner sum = new Scanner(System.in);
        System.out.println("Enter the number =");
		int power = sum.nextInt();
		System.out.println("Enter the power =");
		int powerbiased = sum.nextInt();
		int a = (int) Math.pow(power, powerbiased);
		System.out.println("Power is =" + a);

	}
}
