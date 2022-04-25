package com.task1;

import java.util.Scanner;

public class Pgm37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = sc.next().charAt(0);

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an alphabet.");
		else
			System.out.println(c + " is not an alphabet.");
	}

}
