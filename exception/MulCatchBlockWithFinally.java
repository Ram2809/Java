package com.practice.exception;

public class MulCatchBlockWithFinally {
	public static void main(String[] args)
	{
		try {
			System.out.println(10/0);
			String s=null;
			System.out.println(s.substring(1));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally part");
		}
		System.out.println("Rest of the code");
	}

}
