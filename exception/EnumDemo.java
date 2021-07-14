package com.practice.exception;

public class EnumDemo {
	enum weekDays
	{
		MON,TUES,WED,THURS,FRI,SATUR,SUN;
		weekDays()
		{
			System.out.println(this.toString());
		}
		public void disp()
		{
			System.out.println(weekDays.FRI);
		}
	}
	public static void main(String[] args)
	{
		weekDays w=weekDays.FRI;
		System.out.println(weekDays.MON);
		w.disp();
	}
}
