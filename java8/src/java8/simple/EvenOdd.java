package java8.simple;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int no;
		System.out.println("Enter any integer no");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		if(no % 2 == 0)
		{
			System.out.println("its even");
		}
		else
		{
			System.out.println("its odd");
		}
	}

}
