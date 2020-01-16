package aniket12;
import java.util.Scanner;
public class Array2 {
		public static void main(String[] args) {
			int n,i,arr[];
			arr=new int[5];
			int sum=0;
			Scanner in=new Scanner(System.in);
			System.out.println("enter the size of array");
			
			
			n=in.nextInt();
			
			System.out.println("array is");
			for(i=0;i<n;i++)
			{
				arr[i]=in.nextInt();
				
		}
			for(i=0;i<n;i++) {
		
			
			sum=sum +arr[i];
			}
			System.out.println("array sum is "+sum);
}
}