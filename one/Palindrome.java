package com.practice.one;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int temp=n;
		int rev=0;
		while(temp>0)
		{
			int digit=temp%10;
			rev=(rev*10)+digit;
			temp/=10;
		}
		if(n==rev)
		{
			System.out.println(n+" is a palindrome");
		}
		else
		{
			System.out.println(n+" is not a palindrome");
		}
	}

}
