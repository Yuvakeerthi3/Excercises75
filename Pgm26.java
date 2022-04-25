package com.task;

public class Pgm26 {
	public static void main(String[] args) {
		int km = 15;
		float miles = km * 0.62f;
		int centigrade = 90;
		float fahrenheit = (centigrade * 9 / 5) + 32f;
		int sqft = 1000;
		float acre = sqft / 43560f;
		System.out.println("Km to miles =" + miles);
		System.out.println("Centigrade to fahrenheit =" + fahrenheit);
		System.out.println("sqft to acre =" + acre);

	}


}
