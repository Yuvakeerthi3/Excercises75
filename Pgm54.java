package com.task1;

public class Pgm54 {
	void prime(int a) {
		int i = 2;
		boolean n = true;

		while (i < a) {
			if (a % i == 0) {
				System.out.println("NOT A PRIME NUMbER");
				n = false;
				i = i + 1;
			}
		}

		if (n == true) {
			System.out.println("PRIME NUMbER");
		}
	}

	public static void main(String[] args) {
		Pgm54 num = new Pgm54();
		num.prime(31);

	}

}
