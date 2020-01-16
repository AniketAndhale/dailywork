package aniket12;

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter element in array");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			for( int j=i+1;j<n;j++)
			{
				if(a[i]>a[i+1])
				{
					b[i]=a[i];
			
				}
				else
				{
					b[i]=a[i+1];
				}
			}
			System.out.println("largest no in element"+b[i]);
			
		}
	}

}
