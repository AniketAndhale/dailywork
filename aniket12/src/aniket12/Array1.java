package aniket12;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		int n,i,arr[];
		arr=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		
		
		n=in.nextInt();
		
		System.out.println("array is");
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			
	}
		System.out.println("earray in reverse order array");
		for(i=n-1;i>=0;i--)
		
		{
			System.out.println(" "+arr[i]);
		}
		

}
}