package com.practice.exception;

public class Combo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			int[] arr= {1,2,4};
			System.out.println(arr[90]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			try {
				String s=null;
				System.out.println(s.length());
			}
			catch(NullPointerException ee)
			{
				ee.printStackTrace();
			}
		}
		finally
		{
			System.out.println("Finally part");
			try
			{
				String s1="Ram";
				int a=Integer.parseInt(s1);
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
		}
	}

}
