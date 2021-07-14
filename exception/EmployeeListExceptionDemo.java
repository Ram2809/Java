package com.practice.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListExceptionDemo {

	public static void main(String[] args)throws EmployeeListException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<String> al=new ArrayList<String>();
		al.add("Ram");
		al.add("Rahul");
		al.add("Prem");
		al.add("Indumathi");
		al.add("Babysruthi");
		al.add("Kirithiha");
		al.add("Meena");
		al.add("Mubasheer");
		al.add("Pavithra");
		al.add("Haritha");
		System.out.println("Enter the employee name:");
		String str=s.next();
		if(!al.contains(str))
		{
			throw new EmployeeListException("Employee name is not found in list!");
		}
		else
		{
			System.out.println("Employee name found!");
		}
	}

}
