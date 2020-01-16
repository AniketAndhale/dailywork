package aniket12;
import java.util.Scanner;
public class Student1 {
public static void main(String[] args) {
	Student s=new Student();
			Employe e=new Employe(); 
	Scanner in=new Scanner(System.in);
	System.out.println("enter your choice");
	System.out.println("1.student 2.employe");
	int ch;
	ch=in.nextInt();
	switch(ch)
	{
		case 1:
		s.display();
		break;
		case2:
			e.display();
		break;
	}
}
}


 class Student extends Student1
{
public void display()
{
	String fname,lname,course;
	int age,id;
	
	Scanner in=new Scanner(System.in);
	System.out.println("enter first name ");
	fname=in.nextLine();
	System.out.println("enter first name ");
	lname=in.nextLine();
	System.out.println("enter first course ");
	course=in.nextLine();
	System.out.println("enter first age");
	age=Integer.parseInt(in.nextLine());
	System.out.println("enter first id");
	id=Integer.parseInt(in.nextLine());
	
	
}
}

class Employe extends Student1
{
	public void print() 
	{
	String efname,elname,desig,dname;
	int eid,salary,eage;
	Scanner in=new Scanner(System.in);
	System.out.println("enter first name of emp ");
	efname=in.nextLine();
	System.out.println("enter last name of emp ");
	elname=in.nextLine();
	System.out.println("enter the designasion");
	desig=in.nextLine();
	System.out.println("enter dpt name of emp ");
	dname=in.nextLine();
	System.out.println("enter id of emp");
	eid=Integer.parseInt(in.nextInt());
	System.out.println("enter id of emp");
	eid=Integer.parseInt(in.nextInt());
	System.out.println("enter age of emp");
	eage=Integer.parseInt(in.nextInt());
	System.out.println("enter salary of emp");
	salary=Integer.parseInt(in.nextInt());
	
	public void display() {
		
		System.out.println("firstname"+efname);
		System.out.println("firstname"+efname);
		System.out.println("firstname"+efname);
		System.out.println("firstname"+efname);
		System.out.println("firstname"+efname);
		System.out.println("firstname"+efname);
		System.out.println("firstname"+efname);
		System.out.println("firstname"+efname);
		
	}
	
	
	
	}
}