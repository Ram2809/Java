package com.practice.designPattern;
public class SingleTonDemo {
	public static void main(String[] args)
	{
		SingleTonClassEagerly s=SingleTonClassEagerly.getInstance();
		System.out.println(s);
		SingleTonClassEagerly s1=SingleTonClassEagerly.getInstance();
		System.out.println(s1);
	}
}
