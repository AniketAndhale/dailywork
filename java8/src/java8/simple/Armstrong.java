package java8.simple;

import java.util.Scanner;

public class Armstrong {
		public static void main(String[] args) {
			int no,o,r;
			double result=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no to check Armstrone or not");
			 no=sc.nextInt();
			 o=no;
			 while(o!=0)
			 {
				 r=o%10;
				 result=result+Math.pow(r,3);
				 o=o%10;
			 }
			if(o==no)
			{
				System.out.println(no+"no is a armstrong");
			}
			else
			{
				System.out.println(no+"no is not Armstrong");
			}
		}
}
