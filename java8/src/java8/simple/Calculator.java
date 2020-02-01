package java8.simple;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
		
		
			System.out.println("Enter two no");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			System.out.println("enter an operator(1.+,2.-,3.*,4./ : )");
			char operator = sc.next().charAt(0);
			double output;
			switch(operator)
			{
			case '+': output=n1+n2;
					break;
			case '-': output=n1-n2;
					break;
			case '*': output=n1*n2;
					break;
			case '/': output=n1/n2;
					break;
					
			default: 
			System.out.println("Error");
				return;
			}
			System.out.println("The two no are : "+n1+" "+n2);
			System.out.println("Result of your operation is :"+output);
			
	}
}
