package com.task1;

public class Pgm66 {
	public static void main(String[] args) {
		int[][] x = { { 1, 1, 1 }, { 2, 1, 2 }, { 3, 2, 2 } };
		int[][] y = { { 1, 2 }, { 2, 3 }, { 1, 1 } };
		int[][] result = new int[3][2];
		int product = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					product += x[i][k] * y[k][j];
					result[i][j] = product;

				}
				product = 0;
				System.out.print(result[i][j] + " ");

			}

			System.out.println();
		}

	}

}
