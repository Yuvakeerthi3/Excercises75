package com.task1;

import java.util.Scanner;

public class Pgm53 {
	public static void main(String[] args) {
		Scanner cal=new Scanner (System.in);
		System.out.println("Enter the number");
		int p=cal.nextInt();
		System.out.println("Enter the number");
		int q=cal.nextInt();
		System.out.println("Enter the number");
		int r=cal.nextInt();
		System.out.println("Enter the case");
		int a=cal.nextInt();
		
		switch(a)
		{
		case 1:
		{
			System.out.println("ADDITION ="+(p+q+r));
			break;
		}
		case 2:
		{
			System.out.println("SUSTRACTION ="+(p-r));
			break;
		}
		case 3:
		{
			System.out.println("MULTIPLICATION ="+(p*q*r));
			break;
		}
		case 4:
		{
			System.out.println("DIVISION ="+(p/q));
			break;
		}
		
		
	}

}

}
