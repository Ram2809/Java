package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringStream {

	public static void main(StringDemo[] args) {
		// TODO Auto-generated method stub
		List<String> Employee=Arrays.asList(new String[] {"Aby","Mani","Bala","Vijay","Easki","Opliha"});//passing array as argument to a list
		Stream<String> EmployeeStream=Employee.parallelStream();
		System.out.println("The employees are:");
		EmployeeStream.forEach(name->System.out.println(name));
		List<String> s=Arrays.asList("ant","fly","bufferfly");
		s.stream().filter(n->n.length()>5).forEach(System.out::println);
		s.stream().map(x->x.length()).forEach(System.out::println);
		s.stream().map(String::length).forEach(System.out::println);
		s.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		List<Integer> list1=Arrays.asList(3,7,89,67);
	    list1.parallelStream().map(x->x>10).forEach(System.out::println);
	    list1.stream().map(x->x/3).forEach(System.out::println);
	      
	}

}
