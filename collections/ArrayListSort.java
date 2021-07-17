package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSort {

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
		Object[] arr=al.toArray();
		Arrays.sort(arr);
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
