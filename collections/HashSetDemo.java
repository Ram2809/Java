package com.practice.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
class Student2
{
	Integer id;
	String name;
	public Student2(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=100;i<=200;i++)
		{
			if(i%2==0)
			{
				hs.add(i);
			}
		}
		hs.add(160);
		System.out.println(hs);
		Set<Student2> sSet=new TreeSet<Student2>(new NameComparator());//new IDComparator());
		sSet.add(new Student2(101,"Sreeja"));
		sSet.add(new Student2(3,"Tara"));//adding elements into the custom list
		sSet.add(new Student2(2,"Zara"));
		sSet.add(new Student2(1,"Aila"));
		Iterator i=sSet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
	}

}
