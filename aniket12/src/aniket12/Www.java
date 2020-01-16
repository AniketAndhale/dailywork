
//Write a program which accepts two integers as a minimum and maximum limit and calculates total of how many 1s were their within the limit.
    
    //1) if user input 1 11 then it should print 4.
   // 2) if user input 11 111 then it should print 34.\*
package aniket12;

import java.util.Scanner;

public class Www {
	public static void main(String[] args) {
		
		int m,n,i;
		int k=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter lower limit");
		n=in.nextInt();
		
		System.out.println("enter upper limit");
		m=in.nextInt();
		
for(i=n;i<=m;i++)
{
	int temp=i;
	while(temp!=0)
		
	{
		if(temp%10==1)
		{
			k++;
		}
		temp=temp/10;
	}
}
System.out.println(k);
		}

		
	}
	