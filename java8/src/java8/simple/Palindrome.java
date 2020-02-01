package java8.simple;

public class Palindrome {
public static void main(String[] args) {
	int num = 121, r = 0,s,t;
    s = num;
   
    while( num != 0 )
    {
        t = num % 10;
        r = r * 10 + t;
        num  /= 10;
    }
    
    if (s == r)
        System.out.println(s + " is a palindrome.");
    else
        System.out.println(s + " is not a palindrome.");
}
}
