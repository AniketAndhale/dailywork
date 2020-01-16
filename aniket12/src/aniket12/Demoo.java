package aniket12;
import java.util.Scanner;

public class Demoo {
	static void print() throws Exception
	{
		System.out.println("inside fun()");
		throw new Exception("demo");
		
	}
public static void main(String[] args) {
	try
	{
print();
	
	}
	catch(Exception e) {
		System.out.println("sssswssss");
	}
}
}
