package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class A
{
	public static int sum(int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
public class StringDemo {
	public static void main(String[] args)
	{
		int sum=A.sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println(sum);
		String[] names= {"Alya","Aila","","Sanjeev","Sreya","Sidhu","Navya","Kumaran"};
		List<String> al=Arrays.asList(names);
		List<String> AList=al.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		AList.forEach(name->System.out.println(name));
		List<String> ASortList=al.stream().filter(n->n.startsWith("A")).sorted().collect(Collectors.toList());
		ASortList.forEach(name->System.out.println(name));
		List<String> ADesSortList=al.stream().filter(n->n.startsWith("A")).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		ADesSortList.forEach(name->System.out.println(name));
		al.stream().filter(n->n.startsWith("A")).map(n->n.toUpperCase()).forEach(System.out::println);
		boolean anyMatch=al.stream().anyMatch(n->n.startsWith("A"));
		System.out.println(anyMatch);
		boolean allMatch=al.parallelStream().allMatch(n->n.startsWith("A"));
		System.out.println(allMatch);
		boolean NoMatch=al.stream().noneMatch(n->n.startsWith("A"));
		System.out.println(NoMatch);
		long count=al.stream().filter(n->n.startsWith("A")).count();
		System.out.println(count);
	}
}
