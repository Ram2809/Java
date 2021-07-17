package com.practice.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExtraDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=1;i<=10;i++)
		{
			ll.add(i);
		}
		ll.add(10,200);
		System.out.println(ll); 
		//descending iterator(print the elements in reverse order)
		Iterator i=ll.descendingIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		List<Integer> l1=Arrays.asList(1,2,3,4,5,9,3,2,10);
		LinkedList<Integer> ll1=new LinkedList<Integer>(l1);
		System.out.println(ll1);
		ll1.addFirst(11);
		ll1.addLast(90);
		System.out.println(ll1);
		System.out.println(ll1.getFirst());
		System.out.println(ll1.getLast());
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println(ll1);
		ll1.removeFirstOccurrence(2);
		ll1.removeLastOccurrence(3);
		System.out.println(ll1);
		System.out.println(ll1.peekFirst());
		System.out.println(ll1.peekLast());
		System.out.println(ll1);
		System.out.println(ll1.pollFirst());
		System.out.println(ll1.pollLast());
		System.out.println(ll1);
		ll1.replaceAll(a->a.max(5,6));
		System.out.println(ll1);
		ll1.push(90);
		System.out.println(ll1);
		System.out.println(ll1.pop());
		System.out.println(ll1);
	}

}
