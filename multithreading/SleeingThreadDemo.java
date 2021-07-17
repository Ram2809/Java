package com.practice.multithreading;
class Addition extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Addition table:");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("5"+"+"+i+"="+(i+5));
		}
	}
}
class Subtraction extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Subtraction table:");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("10"+"-"+i+"="+(10-i));
		}
	}
}
public class SleeingThreadDemo {
	public static void main(String[] args)
	{
		Addition a=new Addition();
		Addition a1=new Addition();
		Subtraction s=new Subtraction();
		Subtraction s1=new Subtraction();
		System.out.println(a.getState()+" "+a1.getState()+" "+s.getState()+" "+s1.getState());
		a.start();
		s.start();
		a1.start();
		s1.start();
		System.out.println(a.getState()+" "+a1.getState()+" "+s.getState()+" "+s1.getState());
		try {
			a.join();
			a1.join();
			s.join();
			s1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.getState()+" "+a1.getState()+" "+s.getState()+" "+s1.getState());
	}
}
