package java8.simple;

import java.util.Scanner;

public class Naturalsum {
	public static void main(String[] args) {
		int no,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to get sum ");
		no=sc.nextInt();
		for(int i=1;i<=no;++i)
		{
			sum=sum+i;
		}
		System.out.println("The Sum Of Natural Number Are :"+sum);
	}

}
