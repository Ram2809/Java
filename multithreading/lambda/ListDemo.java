package com.practice.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=Arrays.asList(6,7,8,9,10,6,1,2,3,4,5,3);
		Set<Integer> hs=new LinkedHashSet<Integer>(al);
		System.out.println("The list elements are:");
		al.forEach(x->System.out.println(x));
		System.out.println("The set elements are:");
		hs.forEach(x->System.out.print(x+" "));
	}

}
