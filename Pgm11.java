package com.task;

import java.text.DecimalFormat;

public class Pgm11 {
	public static void main(String[] args) {
		double x = 7.50d;
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(df.format(x));
	}

}
