package com.practice.one;
import java.io.*;
import java.util.*;
public class BiggestOfThree {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a+" is greater!");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+" is greater!");
		}
		else
		{
			System.out.println(c+" is greater!");
		}
	}
}
