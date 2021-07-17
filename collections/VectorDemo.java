package com.practice.collections;

import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<=5;i++)
		{
			v.add(i);
		}
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");;;;;
		}
		System.out.println();
		Queue<Integer> q=new LinkedList<Integer>();
		PriorityQueue a=new PriorityQueue();
		//a.
		Stack<Integer> s=new Stack<Integer>();
		s.add(10);
		s.push(23);
		s.add(2,90);
		s.push(89);
		s.add(34);
		System.out.println(s.search(10));
	}
}
