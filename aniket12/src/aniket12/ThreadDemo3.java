package aniket12;

public class ThreadDemo3 {
public static void main(String[] args) {
	System.out.println("main thread");
	Thread t=Thread.currentThread();
	t.setPriority(Thread.MAX_PRIORITY-2);
	FirstThre fs=new FirstThre();
	SecondThre ss=new SecondThre();
	Thread t1=new Thread(fs);
	Thread t2=new Thread(ss);
	t2.setPriority(Thread.MIN_PRIORITY+2);
	t1.start();
	t2.start();
	System.out.println("First thread priority:"+t1.getPriority());
	System.out.println("First thread priority:"+t2.getPriority());
	
}
}
	class FirstThre implements Runnable
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


	class SecondThre implements Runnable
	{
		
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					System.out.println("second thread : "+i);
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
	
	
	
	
	
	class Resourse
	{
		public static void main(String[] args) {
			for(int i=1;i<=5;i++)
			{
				System.out.println(message+""+i);
			}
		}
	}