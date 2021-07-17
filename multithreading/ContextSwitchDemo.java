package com.practice.multithreading;
class Table extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread"+" "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("5"+"x"+i+"="+(i*5));
		}
	}
}
public class ContextSwitchDemo {
	public static void main(String[] args) throws InterruptedException
	{
		Table t=new Table();
		Table t1=new Table();
		/*t.start();//calling a thread twice
		t.start();*/
		/*t.run();//no context switching will happen between threads while you invoking a run() method instead of start() method
		t1.run();*/
		t.start();
		t.join();
		t1.start();
	}
}
