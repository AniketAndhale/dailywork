package aniket12;

import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		int n,i,arr[],min,max;
		arr=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		
		
		n=in.nextInt();
		
		System.out.println("array is");
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			
	}
	    max = arr[0];
	    min = arr[0];

	   
	    for(i=1; i<a[i].length; i++)
	    {
	     
	        if(arr[i] > max)
	        {
	            max = arr[i];
	        }
	        if(arr[i] < min)
	        {
	            min = arr[i];
	        }
	    }

	    System.out.println("maximum"+max);
	    System.out.println("minimum",+min);
	 

}
