
package com.task1;

public class Pgm49 {
	public static void main(String[] args) {
		int a = 31, i = 2;
		boolean n = true;
		int num=a/2;
		while (i < num) {
			if (a % i == 0)
			{
				System.out.println("NOT A PRIME NUMbER");
			n = false;
			i = i + 1;
			}
		}
		

		if (n == true)
		{
			System.out.println("PRIME NUMbER");
		}
	}

}
