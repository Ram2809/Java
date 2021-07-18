package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToListToStream {
	public static void main(String[] args)
	{
		List<Integer> al=Arrays.asList(2,4,6,8,10,1,3,5,7,9);
		Stream<Integer> iStream=al.stream();
		//iStream.forEach(System.out::println);
		List<String> StringAl=Arrays.asList("Areeja","Bharathi","Aayaseelan","Kavi","Jayakumar","Jayalakshmi");
		Stream<String> sStream=StringAl.stream();
		sStream.forEach(name->System.out.println(name));
		//System.out.println(iStream.count());
		System.out.println(iStream.filter(n->n>2).count());
		DoubleStream ds=DoubleStream.of(1.2,2.3,3.4,4.5,5.6);
		OptionalDouble Doublesum=ds.reduce((a,b)->a+b);
		System.out.println("Double sum:"+Doublesum);
		IntStream is=IntStream.of(100,200,450,50,120);
		OptionalInt intSum=is.reduce((a,b)->a+b);
		System.out.println("Int sum:"+intSum);
		StringAl.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
		StringAl.stream().filter(n->n.startsWith("A")).sorted().forEach(System.out::println);
		StringAl.stream().filter(n->n.startsWith("A")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		StringAl.stream().filter(n->n.startsWith("A")).sorted(Comparator.reverseOrder()).forEach(name->System.out.println(name));
		StringAl.stream().filter(n->n.startsWith("A")).map(n->n.toUpperCase()).sorted().forEach(System.out::println);
	}
}
