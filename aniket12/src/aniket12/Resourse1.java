package aniket12;
class Resourse1
{
public static void main(String[] args) {
	Resourse resourse=new Resourse();
	System.out.println("main thread");
	Thread t=Thread.currentThread();
	FirstThr fs=new FirstThr(resourse);
	SecondThr ss=new SecondThr(resourse);
	Thread t1=new Thread(fs);
	Thread t2=new Thread(ss);
	t1.start();
	t2.start();
}
}


class FirstThr implements Runnable
{
	Resourse resourse;
	public FirstThr(Resourse resourse)
	{
		this.resourse=resourse;
		
	}
	public void run()
	{
		resourse.display("first thread");
	}
}
class SecondThr implements Runnable
{
	Resourse resourse;
	public SecondThr(Resourse resourse)
	{
		this.resourse=resourse;
		
	}
	public void run()
	{
		resourse.display("second thread");
	}
}

	class Resourse
	{
		public void display(String message) {
			synchronized(this) {
			for(int i=1;i<=5;i++)
			{
				System.out.println(message+""+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		}
	}
