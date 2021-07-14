package com.practice.one;

public class Manager1 extends Employee1{
	String EmpDept="ProductTeam";

	@Override
	public String toString() {
		return "Manager1 [EmpDept=" + EmpDept + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
