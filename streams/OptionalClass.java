package com.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionalDouble op=IntStream.of(1,2,3,4,5,6).average();
		System.out.println("The avg is:"+op.getAsDouble());
		OptionalInt maxValue=IntStream.of(1,2,3,90,100,45,67,23).max();
		System.out.println("The min is:"+maxValue.getAsInt());
		OptionalInt minValue=IntStream.of(1,2,3,90,100,45,67,23).min();
		System.out.println("The min is:"+minValue.getAsInt());
		int sum=IntStream.range(1, 6).sum();
		System.out.println("the sum(1,5):"+sum);
		System.out.println("The sum of 1st five numbers and add 10 to that:");
		int sum1=IntStream.range(1,6).reduce(10,(x,y)->x+y);
		System.out.println(sum1);
		int sum2=IntStream.range(1,6).filter(n->n%2==0).sum();
		System.out.println("The sum of even(1,5):"+sum2);
		
			List<Integer> intList = Arrays.asList(5,7,13,9,-1);
			Optional<Integer> result = intList.stream().filter((a)->a>0).reduce((a,b)->a<b?a:b);
			if(result.isPresent()) {
				System.out.println("The min element(Result):"+result.get());
				
				List<String> stringList = new ArrayList<>();
				
				stringList.add("a");
				stringList.add("b");
				stringList.add("a");
				
				Stream<String> stream = stringList.stream();
				
				// reduce list to store it in optional 
				System.out.println("Step 1. Reduce list to store it in optional.");
				// a container object may or may not contain a non-null value
				Optional<String> optional = stream.sorted().reduce((s1, s2)-> s1 + ", " + s2);
				
				// display optional - isPresent() will return true if a value is present
				System.out.println(optional.isPresent());
				
				// get value
				System.out.println(optional.get());
				
				// OR
				
				//optional.ifPresent(System.out::println);
				OptionalInt first=IntStream.of(1,2,3,4,5,7).findFirst();
				System.out.println("The first element is:"+first.getAsInt());
				OptionalInt any=IntStream.of(1,2,3,4,5,7).findAny();
				System.out.println("The any element is:"+any.getAsInt());
				
	}

}
}
