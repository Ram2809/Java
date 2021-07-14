package com.practice.one;
import java.util.*;
public class Student {
	int rollNo;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int totalMark;
	void setStudDetails()
	{
		rollNo=101;
		name="Tara";
		mark1=99;
		mark2=78;
		mark3=90;
	}
	int findTotal()
	{
		return mark1+mark2+mark3;
	}
	public void dispStudDetails()
	{
		System.out.println("RollNo:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("TotalMarks:"+findTotal());
	}
}
