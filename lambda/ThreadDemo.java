package com.practice.lambda;
class Sample
{
	Runnable r1=new Runnable()
			{
				public void run()
				{
					System.out.println("Thread1 is started...");
				}
			};
			Runnable r2=()->{System.out.println("Thread2 is started...");};
}
public class ThreadDemo {
	public static void main(String[] args)
	{
		Runnable r1=new Runnable()//creating a thread by implementing Runnable interface without lambda expression
		{
			public void run()
			{
				System.out.println("Thread1 is started...");
			}
		};
		Runnable r2=()->System.out.println("Thread2 is started...");//creating a thread by implementing Runnable interface with lambda expression
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r2);
		t2.start();
	}
}
