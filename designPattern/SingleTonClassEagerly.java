package com.practice.designPattern;

public class SingleTonClassEagerly {
	static SingleTonClassEagerly obj=new SingleTonClassEagerly();
	private SingleTonClassEagerly()
	{
		
	}
	public static SingleTonClassEagerly getInstance()
	{
		return obj;
	}
}
