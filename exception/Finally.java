package com.practice.exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
		finally
		{
			System.out.println("Finally part");
		}
	}

}
