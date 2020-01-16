package aniket12;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread =Thread.currentThread();
		System.out.println(thread);
		System.out.println("Thread Name: "+thread.getName());
		thread.setName("cts Thread");
		System.out.println(thread.getName());
		System.out.println("is thread daemon: "+thread.isDaemon());
		System.out.println("is thread Alive: "+thread.isAlive());
		System.out.println("thread state: "+thread.getState());
		System.out.println("thread id: "+thread.getId());
	}

}
