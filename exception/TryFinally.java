package com.practice.exception;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String a="Hi";
			//int a=10;
			int b=20;
			System.out.println(a+b);
		}
		finally
		{
			System.out.println("Finally part");
		}
	}

}
