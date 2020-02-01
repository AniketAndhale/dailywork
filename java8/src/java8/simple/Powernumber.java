package java8.simple;

public class Powernumber {
	public static void main(String[] args) {
		
		int b = 3, exponent = 4;
        long r = 1;
        while (exponent != 0)
        {
            r =r* b;
            --exponent;
        }
        System.out.println("Answer = " + r);
	}

}
