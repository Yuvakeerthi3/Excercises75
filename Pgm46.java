package com.task1;

public class Pgm46 {
	public static void main(String[] args) {

		int a = 12495, t = 0, reverse = 0;
		while (a > 0) 
		{
		    t = a % 10; 
		    // a=12495%10= 5 ,1249%10= 9 ,124%10= 4 ,12%10= 2 ,1%10= 1......
		    reverse = reverse * 10 + t;
		    //r=0*10+5=5 ,5*10+9=59 ,59*10+4=594 ,594*10+2=5942 ,5942*10+1=59421.....
			a = a / 10;
			//12495/10=1249 ,1249/10=124 ,124/10=12 ,12/10=1 ,1/10=0......
		}
		System.out.println("Reverse number =" + reverse);                     
		}
}
