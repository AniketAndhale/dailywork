package aniket12;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		int n  ,j,temp;
		arr=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		
		
		n=in.nextInt();
		
		System.out.println("array is");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			
	}
	for(i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
{
	temp=a[j];
	a[j]=b[j];
	b[i]=temp;
	
}
System.out.println("array in ascending order:"+b[i]);
fori(i=0;i<n;i++)
{
	System.out.println(" "+a[i]);
	
}
System.out.println(a[n-1]);

		}
	}

}
}