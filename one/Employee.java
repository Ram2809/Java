package com.practice.one;

public abstract class Employee {
	int empID;
	String empName;
	void input()
	{
		empID=1001;
		empName="Rahul";
	}
	void output()
	{
		System.out.println("Employee ID:"+empID);
		System.out.println("Employee Name:"+empName);
	}
	abstract String roles_Responsibilities();
}
