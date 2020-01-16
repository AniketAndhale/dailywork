package aniket12;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		
	
	int l,b,p;
	System.out.println("enter lenght and breadth");
	
	Scanner in=new Scanner(System.in);
	l=in.nextInt();
	b=in.nextInt();
	p=2*(l+b);
	System.out.println("perimeter of rect "+p);
}

}
