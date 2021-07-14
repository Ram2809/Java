package com.practice.one;
import java.util.*;
public class Factorial {
	public static int fact(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args)
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		System.out.println("The factorial of "+ n +" is "+fact(n));
	}
}
