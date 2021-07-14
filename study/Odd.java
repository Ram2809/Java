package com.practice.study;

public class Odd {

	static boolean isOdd(int n)
	{
		if(n%2!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(isOdd(n));
	}

}
