package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Creation {
	@SuppressWarnings("unchecked")
	public static void main(StringDemo[] ags)
	{
		Stream<Integer> s=Stream.of(1,2,6,5,8,90,234,56,12,2,5,90,21);
		System.out.println("The stream elements are:");
		System.out.println(s);
		s.forEach(x->System.out.println(x));
		System.out.println("The stream elements are(creating stream via list):");
		List<Integer> al=Arrays.asList(1,2,6,5,8,90,234,56,12,2,5,90,21);
		al.stream().forEach(x->System.out.println(x));
		//Stream<List> s1=Stream.of(al);
		System.out.println("filter example:");
		al.stream().filter(n->n>5).forEach(System.out::println);//filter method
		List<Integer> newList=al.stream().filter(n->n>50).collect(Collectors.toList());//collector method
		System.out.println("Collector example:");
		newList.stream().forEach(System.out::println);
		System.out.println("Reduce example");
		al.stream().limit(5).forEach(x->System.out.println(x));
		System.out.println("Distinct example");
		al.parallelStream().distinct().forEach(System.out::println);
		Stream<StringDemo> StringStream=Stream.of("Ram","Rahul","Prem","Aila","Tara");//String stream
		System.out.println("The string stream elements are:");
		StringStream.forEach(System.out::println);
		List<StringDemo> Employee=Arrays.asList(new StringDemo[] {"Aby","Mani","Bala","Vijay","Easki","Opliha"});//passing array as argument to a list
		Stream<StringDemo> EmployeeStream=Employee.parallelStream();
		System.out.println("The employees are:");
		EmployeeStream.forEach(name->System.out.println(name));
		EmployeeStream.filter(n->n.length()>7).forEach(System.out::println);;
	}
}
