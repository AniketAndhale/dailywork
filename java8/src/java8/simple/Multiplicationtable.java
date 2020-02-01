package java8.simple;

import java.util.Scanner;

public class Multiplicationtable {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the no for which you want table");
	int no=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.printf("%d * %d = %d \n", no, i, no * i);
	}
}
}
