package aniket12;
import java.util.Scanner;
public class Array6 {
	public static void main(String[] args) {
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in array");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		if(a[i]%2==0)
		{
			System.out.println("array is even");
		
		}
		else
		{
			System.out.println("array is odd");
		}
}
}