package com.practice.designPattern;

public class SingleTonClassLazyDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTonClassLazy s=SingleTonClassLazy.getInstance();
		SingleTonClassLazy s1=SingleTonClassLazy.getInstance();
		System.out.println(s);
System.out.println(s1);
	}

}
