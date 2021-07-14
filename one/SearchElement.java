package com.practice.one;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the key:");
		int key=s.nextInt();
		boolean flag=false;
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
				index=i;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element found at "+index);
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
