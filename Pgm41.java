package com.task1;

public class Pgm41 {
	public static void main(String[] args) {
		int a = 0, c = 1;
		for (int i = 0; i <= 10; i++) {
			int d = a + c;
			a = c;
			c = d;
			System.out.println("FIbONNACCI SERIES =" + d);
		}
	}

}
