package com.practice.multithreading;

public class Creation extends Thread {
	public void run()
	{
		System.out.println("Thread is started..");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Creation obj=new Creation();
		obj.start();
		/*obj.setName("Child");
		obj.setPriority(10);
		System.out.println(obj.toString());
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		//System.out.println(obj.getState());
		obj.join();
		System.out.println(obj.getState());
		System.out.println(obj.activeCount());*/
		
	}

}
