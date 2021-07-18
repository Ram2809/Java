package com.practice.streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalClassDemo {

	public static void main(String[] args) {
		OptionalInt op=OptionalInt.of(120);
		Optional<Integer> op1=null;
		System.out.println(Optional.ofNullable(op1));//Optional.of(optional value)-->it allows passed parameter as a null value
		System.out.println(op.isPresent());
		System.out.println(op);
		System.out.println(op.isPresent());
		try
		{
			System.out.println(op.getAsInt());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int value=op.orElse(124);
		System.out.println(value);
		op.ifPresent(System.out::println);
		op.ifPresent(n->System.out.println(n));
	}

		
}

