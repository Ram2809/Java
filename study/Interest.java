package com.practice.study;

public interface Interest {
	public static final String bankName="ICICI Bank";
	public abstract float getInterest();
	default void printMessage()
	{
		System.out.println("Welcome to"+"  "+bankName);
	}
	static double calTotalInterest(float interest,int months)
	{
		return interest*months;
	}
}
