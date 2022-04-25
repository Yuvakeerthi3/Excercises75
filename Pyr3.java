package com.task1;

/* *      1,3,1
  ***     2,2,3
 *****    3,1,5
*******   4,0,7
 */

public class Pyr3 {
	public static void main(String[] args) {
		int row = 8;
		for (int i = 1; i <= row; i++) {
			for (int space = 1; space <= row - i; space++) {
				System.out.print("@");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("%");
			}
			for (int u = 1; u <= row - i; u++) {
				System.out.print("@");
			}

			System.out.println();
		}
	}
		}
	/*	int n = 5;
		int num = (n*2-1)/2;  //4
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 2 - 1; j++) {  //9
				if (j >= num - i && j <= num + i) 
					System.out.print("%");
				 else
					System.out.print("@");
			}
					System.out.println();
				} */
		/*	int n=3;
		int num=(n*2-1)/2;
		int i=0,j=0;
		while(i<n)
		{
			while(j<n*2-1)
			{ 
				if(j>=num-i && j<=num+i)
			
				System.out.print("%");
			else
				System.out.print("@");
				j++;
			}
			    i++;
                System.out.println();
			
		}
	}
			

}*/

