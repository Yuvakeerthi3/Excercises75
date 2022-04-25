package com.task1;

public class Pgm51 {
	public static void main(String[] args) {

		for (int i = 200; i <= 300; i++) {
			int temp = i;
			int n = 0, r = 0, sum = 0;
			while (temp != 0) {
				temp /= 10;
				n=++n;
			}
			temp = i;
			while (temp != 0) {
				r = temp % 10;
				sum = sum +(int)Math.pow(r,n);
				temp /= temp;
			}
			if (sum == i)
				System.out.println(i + "is a armstrong number");
			else
				System.out.println(i + "not an armstrong number");
			sum=0;n=0;
			}
	}
}
