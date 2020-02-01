package java8.simple;
import java.util.Scanner;
public class Countnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to count digit in that no");
		int no=sc.nextInt();
	int count = 0; 
    while(no != 0)
    {
        
        no =no/10;
        count++;
    }
    System.out.println("Number of digits: " + count);
}
}