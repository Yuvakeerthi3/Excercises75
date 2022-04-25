package com.task1;

public class Pgm68 {
	public void multiply(int x, int y) {
		int[][] x1 = { { 1, 1, 1 }, { 2, 1, 2 }, { 3, 2, 2 } };
		  int[][] y1 = { { 1, 2 }, { 2, 3 }, { 1, 1 } };

		int[][] result = new int[3][2];
		int product = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					product += x1[i][k] * y1[k][j];
					result[i][j] = product;
             }
				product = 0;
				System.out.print(result[i][j] + " ");
				}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pgm68 mul = new Pgm68();
		int[][] y1 = null;
		int[][] x1 = null;
		mul.multiply(x1[3][3],y1[3][2]);

	}

}
