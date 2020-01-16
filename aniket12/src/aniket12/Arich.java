package aniket12;

public class Arich {
	public static void main(String[] args) {
		Test t=new Test()
				{
		public void display()
		{
			System.out.println("ddddddd");
		}
				};
		
		t.display();
	}
	}


interface Test
{
	 void display();
	
}