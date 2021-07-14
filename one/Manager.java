package com.practice.one;

public class Manager extends Employee {
	public String roles_Responsibilities()
	{
		return "Manages everything";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Manager();
		e.input();
		e.output();
		System.out.print("Roles and Responsibilities:"+e.roles_Responsibilities());
	}

}
