package aniket12;

import java.util.Scanner;

public class inheritance {
	public static void main(String[] args) {
		Devop d = new Devop();
		d.display();
		d.getdata();
		d.print();
		d.show();
	}

}

class Emp {
	int id;
	String name;
	String company;

	public void display() {
		System.out.println(id + " " + name + " " + company + " ");
	}

	public void getdata() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter id");
		id = Integer.parseInt(in.nextLine());
		System.out.println("enter name");
		name = in.nextLine();
		System.out.println("enter company");
		company = in.nextLine();
		System.out.println("id=" + id + "name=" + name + "company=" + company);

	}

}

class Manager extends Emp {
	String[] team;
	String dept;
	int n = 5, i;

	public void print() {
		int n = 5, i;
		Scanner in = new Scanner(System.in);
		System.out.println("enter member");
		for (i = 0; i < n; i++) {
			team[i] = in.nextLine();
		}
	}

class Devop extends Emp {
	String projectname;
	String domain;



	public void show() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter projectname");
		projectname = in.nextLine();
	}
	
}
}
