package com.practice.one;

import java.util.Scanner;

public class Arithmetic implements Calculator{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		Calculator c=new Arithmetic();
		System.out.println("The sum is:"+c.add(a, b));
		System.out.println("The sub is:"+c.sub(a, b));
		System.out.println("The mul is:"+c.mul(a, b));
		System.out.println("The div is:"+c.div(a, b));
	}

}
