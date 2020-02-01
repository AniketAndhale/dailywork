package java8.simple;

import java.util.Scanner;

public class Zero {
	public static void main(String[] args) {
		int no;
		System.out.println("enter no ");
		Scanner sc = new Scanner(System.in);
		no=sc.nextInt();
		if(no<0)
		{
			System.out.println("It is negative no :"+no);
		}
		else if(no>0)
		{
			System.out.println("It is positive no :"+no);
		}
		else
			System.out.println("Number itself Zeo :"+no);
	}

}
