package aniket12;

public class Outer {
	public static void main(String[] args) {
		
			Sk s=new Sk();
			
			s.display();
	
	}

}
class Sk
{
	
			
			int x=10;
			static int y=5;
				public void display() {
					class member
					{
						public void show()
						{
							System.out.println(x);
							System.out.println(y);
						}
					}
					class such{
						public void print()
						{
							System.out.println(x);
							System.out.println(y);
						}
					}
				
				member m=new member();
				m.show();
				such s1=new such();
				s1.print();
				}
				

	}

