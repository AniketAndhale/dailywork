package aniket12;
import java.util.Scanner;
import java.util.*;
public class Product {

	public static void main(String[] args) {
		
		String pn;
		int q,p;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the product Quantity");
		q=in.nextInt();
		System.out.println("enter the product name");
		pn=in.nextLine();
		
		if(pn.equals("apple"))
		{
			p=(q*45);
					System.out.println("total"+p);
			
		}
		else if(pn.equals("mobile"))
		{
			p=(q*20);
				System.out.println("total cost of mobile"+p);
		}
	}
}
