package com.task1;

import java.util.Scanner;

public class Pgm56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (checkPrime(i)) {
				if (checkPrime(number - i)) {
					int n=number-i;
					System.out.println( number+"="+i+"+"+n);
					flag = true;
				}
			}
		}

		if (!flag) {
			System.out.println(number+ " cannot be expressed as the sum of two prime numbers.");
		} else {
			System.out.println(number+ " is expressed as the sum of two prime numbers.");
		}
		sc.close();
	}

	public static boolean checkPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;

	}

}


