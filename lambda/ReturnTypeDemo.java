package com.practice.lambda;
interface Add//two parameters without return type
{
	void add(int a,int b);
}
interface Sub//Two parameters with return type
{
	int sub(int a,int b);
}
public class ReturnTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj=(a,b)->System.out.println(a+b);
		System.out.println("Add:");
		obj.add(10,20);
		Sub obj1=(a,b)->{ //int c=a-b; return c;};
			return (a-b);
		};
		System.out.println("Sub:");
		System.out.println(obj1.sub(10,2));
	}

}
