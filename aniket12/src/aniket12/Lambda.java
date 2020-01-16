package aniket12;

public class Lambda {
public static void main(String[] args) {
	//Runnable r=() ->System.out.println("I  am runnable");
	//Thread t=new Thread(r);
	//t.start();
	
	
	//Hello hello=new Hello() {
		//public void display() {
			//System.out.println("this is inner class");
	//Hello h=(int a,int b)->a+b;
//System.out.println(h.add(10, 20));	
	Runnable r=()->{
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
		}
	
	
	
	//hello.display();
	
	//Hello h=()-> System.out.println("this is lambda");
	//h.display();
// }
}
@FunctionalInterface
interface Hello
{
	//public void display();
	public int add(int a,int b);
	
}
