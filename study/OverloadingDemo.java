package com.practice.study;

public class OverloadingDemo {
	//Business Logic
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo od=new OverloadingDemo();
		System.out.println(od.add(4, 5));
		System.out.println(od.add(4, 5,6));
		System.out.println(od.add(1.2f,10));
		System.out.println(od.add(89.09,45.67));
	}
	public Integer add(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return i+j+k+l;
	}

}
