package java8.simple;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no for to calculate  the factorial");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is :"+fact);
		
		
	}

}
