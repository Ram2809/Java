package com.practice.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class AddException extends Exception 
{
	AddException(String msg)
	{
		super(msg);
	}
}
public class CustomException {
	public static void main(String[] args) throws AddException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a<1||b<1)
		{
			throw new AddException("Please enter a positive number");
		}
		else
		{
			System.out.println("The sum is:"+(a+b));
		}
	}
}
