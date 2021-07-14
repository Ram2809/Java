package com.practice.one;

public class Rectangle {
	int length;
	int breadth;
	public Rectangle(int l)
	{
		length=l;
		breadth=l;
	}
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public int area()
	{
		return length*breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5);
		System.out.println(r.area());
		Rectangle r1=new Rectangle(45,90);
		System.out.println(r1.area());
	}

}
