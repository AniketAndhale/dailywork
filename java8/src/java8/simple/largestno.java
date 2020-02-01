package java8.simple;
import java.util.Scanner;
public class largestno {
public static void main(String[] args) {
	int n1,n2,n3;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first no");
	n1=sc.nextInt();
	System.out.println("enter second no");
	n2=sc.nextInt();
	System.out.println("enter third no");
	n3=sc.nextInt();
	if(n1>n2 && n1>n3)
	{
		System.out.println("first no is greater"+n1);
		
	}
	else if(n2>n1&&n2>n3)
	{
		System.out.println("Second no is greater"+n2);
	}
	else
	{
		System.out.println("third no is greater");
	}
	
}
}
