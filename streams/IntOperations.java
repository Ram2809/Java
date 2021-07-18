package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even numbers using of operator");
		IntStream.of(1,2,3,4,5,6).filter(n->n%2==0).forEach(System.out::println);
		//or
		System.out.println("Even numbers using range operator");
		IntStream.range(1, 5).filter(n->n%2==0).forEach(System.out::println);
		System.out.println("Find all even numbers and numbers greater tan 2");
		IntStream intS=IntStream.of(100,23,45,34,78,90,12,200);
		intS.filter(n->n%2==0&&n>2).forEach(System.out::println);
		List<Integer> intList=Arrays.asList(100,23,45,34,78,90,12,200,1,2,4,3);
		System.out.println("Square root of the even numbers in sorted order:");
		intList.stream().filter(n->n%2==0).map(n->Math.sqrt(n)).sorted().forEach(number->System.out.println(number));
	}

}
