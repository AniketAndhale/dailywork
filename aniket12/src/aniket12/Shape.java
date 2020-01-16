package aniket12;

public class Shape {
public static final double pi=3.14;
public void area(int a)
{
	System.out.println("areaa of square"+(a*a));
}
public void area(double a,double b)
{
	System.out.println("areaa of triangle"+(a*b));
}
public void area(int a,float b)
{
	System.out.println("areaa of triangle"+((a*b)/2));
}
public void area(double a)
{
	System.out.println("areaa of cirle"+(pi*(a*a)));
}



public static void main(String [] args)
{
	Shape s=new Shape();
	//s.area(2);
	//s.area(2,2);
	//s.area(5,2.3);
	s.area(6);
}
}