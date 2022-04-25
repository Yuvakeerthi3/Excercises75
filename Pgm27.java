package com.task;

import java.util.Scanner;

public class Pgm27 {
	 public static void main(String[]args)
	   {
		   Scanner year=new Scanner(System.in);
		   System.out.println("Enter the year");
		   int a=year.nextInt();
		   if(a%4==0)
		   {
			   System.out.println("LEAP YEAR");
		   }
		   else
		   {
			   System.out.println("NOT A LEAP YEAR");  
		   }
	   }

}
