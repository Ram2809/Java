package com.practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		int count=0;
		for(int i=0;i<=Integer.MAX_VALUE;i++)
		{
			int ele=s.nextInt();
			if(ele!=0)
			{
				al.add(ele);
				count++;
			}
			else
			{
				break;
			}
		}
		System.out.println("The list elements are:");
		System.out.println(al);
		int sum=0;
		for(Object e : al)
		{
			sum+=(Integer)e;
		}
		float avg=sum%count;
		System.out.println("The avg is:"+avg+" "+count+" "+sum);	
	}

}
