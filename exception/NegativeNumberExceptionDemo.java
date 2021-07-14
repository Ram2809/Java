package com.practice.exception;

import java.util.Scanner;

public class NegativeNumberExceptionDemo {

	public static void main(String[] args) throws NegativeNumberException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		if(n<0)
		{
			throw new NegativeNumberException("You entered a negative number!");
		}
		else
		{
			System.out.println(n+" "+"is a positive number");
		}
	}

}
