package com.practice.study;

public class VarArgsDemo {
	public int sum(int...arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsDemo obj=new VarArgsDemo();
		System.out.println(obj.sum(1,2,3,4,5));
		System.out.println(obj.sum(90,87,65,43,12,90,87,56,43,12));
	}

}
