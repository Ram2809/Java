package com.practice.exception;

import java.util.Scanner;

public class RectangleExceptionDemo {

	public static void main(String[] args) throws RectangleException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length and breadth:");
		int l=s.nextInt();
		int b=s.nextInt();
		if(l<=0 || b<=0)
		{
			throw new RectangleException("Enter a valid dimensions!");
		}
		else
		{
			System.out.println("The area of rectangle is:"+(l*b));
		}
	}

}
