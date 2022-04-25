package com.task1;

import java.util.Scanner;

public class Pyr4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = s.nextInt();
		
		for (int i = 1; i <= row; i++) {
			int p=1;
			for (int j = i; j <= row; j++) {
				System.out.print("    ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(p+++" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(p--+" ");

			}
			System.out.println();

	}
	}
}
