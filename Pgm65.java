package com.task1;

public class Pgm65 {
public static void main(String[] args) {
		
		int[][] mat1 = { { 2, 3, 1 }, { 4, 1, 6 } };
		int[][] mat2 = { { 1, 4, 2 }, { 6, 3, 9 } };
		int[][] sum = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			
		
		System.out.println();
	}

}

}
