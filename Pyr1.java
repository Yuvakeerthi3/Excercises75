package com.task1;

import java.util.Scanner;

public class Pyr1 {
	public static void main(String[] args) {
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter the row =");
		int row = pattern.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int space = 1; space <= row - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();

		}

	}


}
