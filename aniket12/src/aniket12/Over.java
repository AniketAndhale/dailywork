package aniket12;

public class Over {
	public static void main(String[] args) {
		Dev d=new Dev();
		d.display();
		
	}

}
class Empll{
	public void display() {
		System.out.println("emp disp");
	}
}
class Dev extends Empll
{
	public void display() {
		System.out.println("Devloper");
}
}
