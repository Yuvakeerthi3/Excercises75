package com.task1;

public class Pgm67 {
	public static void main(String[]args)
	{
	int a[][]  = { { 3, 7, 1 }, { 9, 1, 7 },{ 6, 3, 9 } };
	int transpose[][]  = new int[3][3];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			transpose[i][j] = a[j][i];
		}
	}
		System.out.println("MATRIX WITHOUT TRANSPOSE =");
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]+"");
			}
			
			System.out.println();
		}
			System.out.println("MATRIX WITH TRANSPOSE =");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					
					System.out.print(transpose[i][j]+"");
				}
				System.out.println();
			}
	}

}
