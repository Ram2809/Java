package com.practice.exception;

public class MultipleCatchBlock {
	public static void main(String[] abc)
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
	System.out.println("Rest of the code");
}

}