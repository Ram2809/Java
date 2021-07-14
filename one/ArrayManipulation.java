package com.practice.one;
import java.util.*;
public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Max:"+arr[arr.length-1]+" "+"Second Max:"+arr[arr.length-2]);
		System.out.println("Min:"+arr[0]+" "+"Second Min:"+arr[1]);
	}

}
