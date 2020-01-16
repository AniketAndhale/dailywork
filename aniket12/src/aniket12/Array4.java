package aniket12;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter element in array");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
			if(b[i]<a[i])
			{
				b[i]=a[j];
			}
		}
			else 
			{
				b[i]=a[j];
		}
		
	}
	}
	System.out.println("second largest no is" +b[0]);
}
}
