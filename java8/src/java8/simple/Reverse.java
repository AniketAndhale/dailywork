package java8.simple;

public class Reverse {
	public static void main(String[] args) {
		int no=548756213,r=0;
		while(no!=0)
		{
			int d=no%10;
			r=r*10+d;
			no=no/10;
		}
		System.out.println("reverse no is "+r);
	}
}
