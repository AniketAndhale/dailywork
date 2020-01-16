package aniket12;

public class GeneralApI{
	public int add(int a,int b)
	{
		return a+b;
		
	}
	public boolean checkEven(int num) {
		if(num%2==0)
		{
			return true;
			
		}
		else {
			return false;
		}
	}

	public int getfactorial(int num)
	
	{
	if(num==1)
	{
		return 1;
		
}
	return num*getfactorial(num-1);
	}
	
	//public boolean getprime(int num) {
	//	boolean status =true;
		
	//}


