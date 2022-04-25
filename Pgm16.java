package com.task;

public class Pgm16 {
	public static void main(String[] args)
	{   
		int R=3;
		int r=2;
		float pi=3.14f;
	    float outercircle= (float)pi*R*R;
	    float innercircle=(float)pi*r*r;
	    float area_of_space =(float)(outercircle-innercircle);
	    System.out.println("area of outercircle:"+outercircle);
	    System.out.println("area of innercircle:"+innercircle);
	    System.out.println("area of space between them :"+area_of_space);


}

}
