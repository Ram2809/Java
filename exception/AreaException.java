package com.practice.exception;

import java.util.Scanner;

public class AreaException {
	static Scanner s=new Scanner(System.in);
	public static void areaOfSquare()
	{
		try
		{
			System.out.println("Enter the side:");
			int side=s.nextInt();
			System.out.println("The area of square is:"+(side*side));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void areaOfRectangle()
	{
		try
		{
			System.out.println("Enter the length and breadth:");
			int l=s.nextInt();
			int b=s.nextInt();
			System.out.println("The area of rectangle is:"+(l*b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		areaOfSquare();
		areaOfRectangle();
	}
}
