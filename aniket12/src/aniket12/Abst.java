package aniket12;

public class Abst {
	
		public static void main(String[] args) {
			Testt t=new Testt()
					{
			public void display()
			{
				System.out.println("ddddddd");
			}
					};
			
			t.display();
		}
		}


	abstract class  Testt
	{
		abstract void display();
		
	}


