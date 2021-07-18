package com.practice.lambda;

import java.util.ArrayList;
import java.util.List;
interface Arith
{
	int add(int a,int b);
}
public class Lambda {
public static void main(String[] args)
{
	List<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<=5;i++)
	{
		al.add(i);
	}
	al.forEach(x->System.out.println(x));
	al.forEach(System.out::println);
	Arith a1=(a,b)->a+b;
	System.out.println(a1.add(3, 4));
}
}
