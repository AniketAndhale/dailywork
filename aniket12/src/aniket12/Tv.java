package aniket12;
import java.util.Scanner;

public class Tv {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter type of tv");
		String pn=scan.nextLine();
		if(pn.equals("lcd"))
		{
			System.out.println("enter size of tv");
			int size=scan.nextInt();
			if(size==14)
			{
				System.out.println("tv with discount 8%");
				
			}
			else if(size==21)
			{
				System.out.println("tv with discount 10%");
			}
			else
			{
				System.out.println("no size available");
		
			}
			else if(pn.equals(CRT))
			{
				System.out.println("discouunt is 5% of sp");
				
			}
			else
				System.out.println("no other type");
				
	

		
	}

}
