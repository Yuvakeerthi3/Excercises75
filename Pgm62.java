package com.task1;

public class Pgm62 {
	public static void main(String[] args) {
		int n = 1010;
		int d = 0, i = 0, r = 0;
		while (n > 0) {
			r = n % 10;
			d = (int) (d + (r * Math.pow(8, i)));
			n = n / 10;
			i++;
		}
		System.out.println("Octadecimal value is =" + d);
	}
	/*
	  int r = 0, n = 12;
	   String binary = ""; 
	   while (n > 0) {
	    r = n % 8;
	     binary= r + binary;
	      n = n / 8;
	   } 
	  System.out.println("binary value is =" + binary); }
	 */

}
