package aniket12;

import java.util.Scanner;

public class Interview {
public static void main(String[] args) {
	int t1,t2,avg;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the score1");
	System.out.println("enter second score");
	t1=in.nextInt();
	t2=in.nextInt();
	avg=(t1+t2)/2;
	if(t1>75&&t2>75)
	{
	if(avg>80)
	{
		System.out.println("get selected");
		
	}
	else
	{
		System.out.println("next time");
	}
	}
	else
	{
		System.out.println("not selected");
	}
}
}
