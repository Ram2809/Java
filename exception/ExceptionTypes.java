package com.practice.exception;

import java.util.Scanner;

public class ExceptionTypes {
	static Scanner s=new Scanner(System.in);
	public static void fun1()
	{
		try
		{
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
	public static void fun2()
	{
		try
		{
			int a=100;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	public static void fun3()
	{
		try
		{
			String a=null;
			System.out.println(a.toUpperCase());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
	public static void fun4()
	{
		try
		{
			String str="Revature";
			System.out.println(str.charAt(9));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice:");
		System.out.println("1.ArrayIndexOutOfBounds Exception");
		System.out.println("2.Arithmetic Exception");
		System.out.println("3.NullPointer Exception");
		System.out.println("4.NumberFormat Exception");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			fun1();
			break;
		case 2:
			fun2();
			break;
		case 3:
			fun3();
			break;
		case 4:
			fun4();
			break;
		default:
			System.out.println("Please Enter a valid choice");
		}
	}

}
