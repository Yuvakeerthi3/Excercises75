package com.task1;

import java.util.Scanner;

public class Pgm50 {
	public static void main(String[] args) {
		int r=0, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		while (n > 0) {
			r = n % 10;
			num = num + (r*r*r);
			n = n / 10;
		}
	       System.out.println("NUMbER =" + num);
		if (temp == num) 
			System.out.println("ARMSTRONG NUMbER");
		 else {
			System.out.println("NOT AN ARMSTONG NUMbER");
		}

	}

}
