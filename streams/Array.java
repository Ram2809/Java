package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array {

	public static void main(StringDemo[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,60,30,50,40,80,70,100,90};
		List<Integer> list=Arrays.asList(10,20,60,30,50,40,80,70,100,90);
		IntStream al=Arrays.stream(arr);
		al.forEach(System.out::println);
		int count=(int) list.stream().filter(n->n>=50).count();
		System.out.println("Count example:"+count);
		System.out.println("The max:"+list.stream().max());
	}

}
