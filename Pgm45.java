package com.task1;

import java.util.Scanner;

public class Pgm45 {
	public static void main(String[] args) {
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number " );
		int a = in.nextInt();
		while (a > 0) {
			a = a / 10;//1234/10=123 , 123/10=12 ,12/10=1 ,1/10=0.....
			count++;// 1 ,2 ,3 ,4....
		}
		System.out.println("NUMbER OF DIGITS =" + count);

	}


}
