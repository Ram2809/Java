package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(2,90);
		al.add(20);
		al.add(53);
		al.add(70);
		al.add(10);
		System.out.println(al);
		System.out.println("Enter the key:");
		Scanner s=new Scanner(System.in);
		int[] ar=new int[al.size()];
		for(int i=0;i<al.size();i++)
		{
			ar[i]=al.get(i);
		}
		Arrays.sort(ar);
		int key=s.nextInt();
		int index=Arrays.binarySearch(ar,key);//binarySearch is only applicable if the array is sorted 
		if(index>=0)
		{
			System.out.println("Element found at"+" "+index);
		}
		else
		{
			System.out.println("Element not found");
		}
		//System.out.println(index);
	}

}
