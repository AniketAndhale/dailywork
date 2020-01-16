package aniket12;

public class ThreadDemo2 {
	public static void main(String[] args) {
		
		System.out.println("main Thread");//By main thread------only 1 thread
		FirstThread fs=new FirstThread();
		fs.start();//it will automatically run()
		
		SecondThread fs1=new SecondThread();
		fs1.start();
	

		}
	}


class FirstThread extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2 !=0)
			{
			System.out.println("first thread : "+i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

class SecondThread extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("second thread");
			}
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
}