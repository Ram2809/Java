package com.practice.multithreading;
class Sample extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("Thread1");
		System.out.println("Child1 Thread is started...");
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class Creation1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Child Thread is started...");
		for(int i=0;i<5;i++)
		{
			try {
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Creation1 obj=new Creation1();
		Thread t1=new Thread(obj);
		t1.start();
		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.start();
		s2.start();
		s1.setPriority(10);
		s2.setPriority(1);
		System.out.println("The Priority of s1 thread is:"+s1.getPriority());
		//System.out.println("The Priority of s2 thread is:"+s2.getPriority());
		System.out.println("The name of s1 thread is:"+s1.getName());
		System.out.println("The ID of s1 thread is:"+s1.getId());
		System.out.println("The status of the s1 thread is:"+s1.isAlive());
		s1.yield();
		s1.suspend();
		s1.resume();
		s1.stop();
		//s1.setDaemon(false);
		System.out.println("Check for Daemeons thread:"+s1.isDaemon());
		s1.interrupt();
		System.out.println("Check whether thread s1 is interrupted or not:"+s1.isInterrupted());
		System.out.println("The active Count of threads are:"+Thread.activeCount());
		System.out.println("The state of the thread s1 is:"+s1.getState());
		System.out.println("The info about the thread:"+s1.toString());
		t1.join();
		s1.join();
		s2.join();
	}
}
