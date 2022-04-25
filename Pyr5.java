package com.task1;

import java.util.Scanner;

public class Pyr5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = s.nextInt();
		
		for (int i = row; i >=1; i--) {
			
			for (int space = 1; space <= i*2; space++) {
				System.out.print(" ");
			}
			for (int j = i; j <row; j++) {
				System.out.print(j+" ");
				
			}
			for (int k = row; k >= i; k--) {
				System.out.print(k+" ");

			}
			System.out.println();

	}
	}
}
