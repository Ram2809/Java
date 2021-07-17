package com.practice.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.addLast(10);
		ll.addLast(20);
		ll.add(2,100);
		ll.add(3,40);
		ll.remove(0);
		ll.remove(2);
		ll.set(0, 1000);
		ll.set(1,500);
		Iterator i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
