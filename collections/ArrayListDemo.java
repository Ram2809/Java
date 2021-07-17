package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
class Student implements Comparable//interface(used for list and we order only one member)
{
	Integer id;
	String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;//casting
		/*if(this.id>s.id)//to sorting the ids
			return 1;
		else if(this.id<s.id)
			return -1;
		else
		 return 0;*/
		return (this.name).compareTo(s.name);//to sorting the names 
	}
	
}
public class ArrayListDemo {
	public static void main(String[] args)
	{
		System.out.println("Creating a list:");
		List l=new ArrayList();//creation of arraylist, here list is the interface and ArrayList is the subclass of List Interface
		l.add(10);//adding element into the arrayList
		l.add(1.2f);
		l.add('a');
		l.add(90.87);
		l.add("Revature");
		l.add(2,"Technology");
		System.out.println("The list elements are:");
		System.out.println(l);
		System.out.println("--------------------------");
		System.out.println("Changing the elements of list:");
		System.out.println("Before updating the list elements:");
		System.out.println(l);
		l.set(2,"Java");//changing the value
		l.set(4, 1000);
		System.out.println("After updating the list elements:");
		System.out.println(l);
		System.out.println("--------------------------");
		System.out.println("Removing the elements of list:");
		System.out.println("Before removing the list elements:");
		System.out.println(l);
		l.remove(1);//removing the element from the list
		l.remove("Java");
		System.out.println("After removing the list elements:");
		System.out.println(l);
		System.out.println("--------------------------");
		System.out.println("Iterating the list using iterator:");
		Iterator ii=l.iterator();
		System.out.println("The list elements are:");
		while(ii.hasNext())
		{
			System.out.print(ii.next()+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Iterating the list using for each:");
		System.out.println("The list elements are:");
		for(Object e: l)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		List<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				al.add(i);//adding elements
			}
		}
		System.out.println("Elements of 1st list:");
		System.out.println(al);//printing
		List<Integer> bl=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				bl.add(i);//adding elements
			}
		}
		System.out.println("Elements of 2nd list:");
		System.out.println(bl);//printing
		System.out.println("--------------------------");
		System.out.println("Combining the two lists:");
		System.out.println("Elements before combined list:");
		System.out.println(al);
		al.addAll(bl);//combine the two lists
		System.out.println("Elements after combined list:");
		System.out.println(al);
		System.out.println("--------------------------");
		System.out.println("Sorting the list:");
		System.out.println("Before sort:");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sort:");
		System.out.println(al);
		System.out.println("--------------------------");
		System.out.println("Creating a list using asList() method");
		List<Float> sample=Arrays.asList(1.2f,2.3f,4.5f,6.7f,5.4f);//adding elements into the list using asList method
		System.out.println("The list elements are:");
		System.out.println(sample);
		System.out.println("--------------------------");
		System.out.println("Removing all elements from list:");
		System.out.println("List before removing all the elements:");
		System.out.println(l);
		l.clear();//empty the list
		System.out.println("List after removing all the elements:");
		System.out.println(l);
		System.out.println("--------------------------");
		System.out.println("Check whether the element is present in the list or not:");
		System.out.println(al.contains(10));//check whether the element is present in the list or not
		System.out.println(bl.contains(10));
		System.out.println("--------------------------");
		System.out.println("Get element from specific index:");
		System.out.println(al.get(2));//get element from specific index
		System.out.println(al.get(7));
		System.out.println("--------------------------");
		System.out.println("Get the index of the element:");
		System.out.println(al.indexOf(10));//get the index of the element
		System.out.println("--------------------------");
		System.out.println("Get the last index of the given element:");
		System.out.println(al.lastIndexOf(5));//get the last index of the given element
		System.out.println("--------------------------");
		System.out.println("Check whether the list is empty or not:");
		System.out.println(al.isEmpty());//check whether the list is empty or not
		System.out.println(l.isEmpty());
		System.out.println("--------------------------");
		System.out.println("Iterating using list iterator:");
		ListIterator ll=al.listIterator();
		System.out.println("The List elements are:");
		while(ll.hasNext())
		{
			System.out.print(ll.next()+" ");
		}
		System.out.println();
		while(ll.hasPrevious())
		{
			System.out.print(ll.previous()+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Creation of string lists:");
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("Ram");
		s1.add(1,"Rahul");
		s1.add("prem");
		System.out.println("The elements of 1st string list are:");
		System.out.println(s1);
		ArrayList<String> s2=new ArrayList<String>();
		s2.addAll(s1);
		s2.add("Kavi");
		s2.add("Abihnav");
		System.out.println("The elements of 2nd string list are:");
		System.out.println(s2);
		System.out.println("--------------------------");
		System.out.println("Size of the list:");
		System.out.println("The size is:"+s2.size());
		System.out.println("--------------------------");
		System.out.println("Creating a sub list from existing list:");
		List<Integer> subList=al.subList(2, 6);//creating a sub list
		System.out.println("The elements of sub list are:");
		System.out.println(subList);
		System.out.println("--------------------------");
		System.out.println("ArrayList to Array Convertion:");
		Object[] arr=subList.toArray();
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Result of retainAll() method");
		System.out.println("Before retainAll() method:");
		System.out.println(al);
		al.retainAll(bl);
		System.out.println("After retainAll() method:");
		System.out.println(al);
		System.out.println("--------------------------");
		System.out.println("Result of removeAll() method");
		System.out.println("Before removeAll() method:");
		System.out.println(s2);
		s2.removeAll(s1);
		System.out.println("After removeAll() method:");
		System.out.println(s2);
		System.out.println("--------------------------");
		System.out.println("Result of replaceAll() method");
		System.out.println("Before replaceAll() method:");
		System.out.println(s2);
		s2.replaceAll(e->e.toUpperCase());//using replaceall method 
		System.out.println("After replaceAll() method:");
		System.out.println(s2);
		System.out.println("---------------------------");
		System.out.println("Creating a custom list");
		//custom Inputs
		ArrayList<Student> sList=new ArrayList<Student>();//Creating Custom inputs(using objects not primitives)
		sList.add(new Student(3,"Tara"));//adding elements into the custom list
		sList.add(new Student(2,"Zara"));
		sList.add(new Student(1,"Aila"));
		System.out.println("The elements of custom list are:");
		Iterator it=sList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------------------");
		System.out.println("Sort the Custom list using Comparator interface:");
		Collections.sort(sList);//to sort the list using comparator interface
		System.out.println("The custom list after sorting:");
		Iterator itt=sList.iterator();
		while(itt.hasNext())
		{
			System.out.println(itt.next());
		}
		System.out.println("---------------------------");
		System.out.println("Copying values of one list into another list:");
		System.out.println("Before copy:");
		System.out.println(al);
		ArrayList<Integer> alCopy=new ArrayList<Integer>(al);
		System.out.println("After copy:");
		System.out.println(al);
	}
}
