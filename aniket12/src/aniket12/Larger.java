package aniket12;

import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		
	int a,b,c;
	Scanner in=new Scanner(System.in);
	System.out.println("enter first no");
	a=in.nextInt();
	System.out.println("enter second no");
	b=in.nextInt();
    System.out.println("enter third no");
	c=in.nextInt();
	
	if(a>b&&a>c)
	{
		System.out.println("largest no"+a);
	}
	else if(b>c)
	{
		System.out.println("largest no"+b);
	}
	else
	{
		System.out.println("largest no: "+c);
	}
	}

}
