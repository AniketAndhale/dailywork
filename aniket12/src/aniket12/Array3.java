package aniket12;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		int n,i,arr[],arr2[];
		arr=new int[5];
		arr2=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		
		
		n=in.nextInt();
		
		System.out.println("array is");
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			arr2[i]=arr[i];
	}
	
		
		for(i=0;i<n;i++)
		{
			System.out.println("array in copied order"+arr2[i]);
		
	}
		
	}
}
