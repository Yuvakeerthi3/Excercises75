package com.task1;

public class Pgm59 {
	public static void main(String[] args) {
		int n1 = 6, n2 = 4;
		int gcd = gcd(n1, n2);

		System.out.printf("G.C.D ="+n1+ " and " +n2+" is "+gcd);
	}

	public static int gcd(int n1, int n2) {
		if (n2 != 0)
			return gcd(n2, n1 % n2);
		else
			return n1;
	}


}
