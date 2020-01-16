package aniket12;
import java.util.Scanner;
public class Age {
public static void main(String[] args) {
	int age;
	Scanner in=new Scanner(System.in);
	System.out.println("enetr age");
	age=in.nextInt();
	if((age>=5)&&(age<=12)) {
		System.out.println("child");
	
	}
	else if((age>=13)&&(age<=19))
	{
		System.out.println("teenagers");
	}
	else if((age>=20)&&(age<=35))
	{
		System.out.println("young");
	}
	else if((age>=36)&&(age<=45))
	{
		System.out.println("matureadult");
	}
	else if((age>=46)&&(age<=55))
	{
		System.out.println("young");
	}
	else
	{
		System.out.println("seniors");
	}
		
}
}
