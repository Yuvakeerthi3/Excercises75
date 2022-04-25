package com.task1;

public class Pgm55 {
	void prime(int i) {
		int count = 0;
		for (int x = 1; x <= i; x++) {
			if (i % x == 0)
				count++;
		}
		if (count == 2)

			System.out.println("PRIME NUMbER");
		else
			System.out.println("NOT A PRIME NUMbER");
	}

	public static void main(String[] args) {
		Pgm55 num = new Pgm55();
		num.prime(7);
	}

}
