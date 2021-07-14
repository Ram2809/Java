package com.practice.one;

public class CountInstance {
	static int count=0;
	CountInstance()
	{
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountInstance c=new CountInstance();
		CountInstance c1=new CountInstance();
		System.out.println("Number instances are:"+count);
	}

}
