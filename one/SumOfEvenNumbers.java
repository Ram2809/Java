package com.practice.one;
import java.io.*;
import java.util.*;
public class SumOfEvenNumbers {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("The sum is:"+sum);
	}

}
