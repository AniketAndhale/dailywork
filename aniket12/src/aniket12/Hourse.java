package aniket12;
import java.util.Scanner;
public class Hourse {
	public static void main(String[] args) {
		int hr,re,tp;

		Scanner in=new Scanner(System.in);
		System.out.println("enter hours");
		hr=in.nextInt();
		System.out.println("enter no of resoure");
		re=in.nextInt();
		tp=hr*re;
		
		System.out.println("Total no of productive hourse: "+tp);
	}

}