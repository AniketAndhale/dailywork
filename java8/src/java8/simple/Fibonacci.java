package java8.simple;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	int t1=0,t2=1;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter no for fibbonaccie series");
	int no=sc.nextInt();
	
		 for (int i = 1; i <= no; ++i)
	        {
	            System.out.print(t1 + " + ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}
	
	
}

