package aniket12;
import java.util.Scanner;
public class Subject {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer();
		int price=0;
	
	System.out.println("java	500 ");
	System.out.println("c	700");
	System.out.println("c++ 	800 ");
	System.out.println("python   900 ");
	System.out.println("angular  600 ");
	String choice=new String();
	Scanner in=new Scanner(System.in);
	String course=in.nextLine();
	if(course.contains("java"))
	{
		b.append("java     500");
		price=price+500;
	}
	
	if(course.contains("c"))
	{
		b.append("c			700");
		price=price+700;
	}
	if(course.contains("c++"))
	{
		b.append("c++     	800");
		price=price+800;
	}
	if(course.contains("python"))
	{
		b.append("python     900");
		price=price+900;
	}
	if(course.contains("angular"))
	{
		b.append("angular     600");
		price=price+600;
	}

	
	System.out.println(price);
	
	}

}
