package com.practice.designPattern;

public class SingleTonClassLazy {
	static SingleTonClassLazy obj;
	private SingleTonClassLazy()
	{
		
	}
	public static SingleTonClassLazy getInstance()
	{
		if(obj==null)
		{
			obj=new SingleTonClassLazy();
		}
		return obj;
	}
	
}
