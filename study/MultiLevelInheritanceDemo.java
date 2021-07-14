package com.practice.study;
class Employee
{
	protected int id;
	String name;
	double salary;
}
class Manager extends Employee
{
	String team;
	void getDetails()
	{
		id=101;
		name="Vijay";
		salary=95000.56;
		team="ProductTeam";
	}
}
class Executive extends Manager
{
	String project_name="RevaturePro";
	void printDetails()
	{
		System.out.println(id+"  "+name+"  "+team+"  "+project_name+"  "+salary);
	}
}
public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Executive e=new Executive();
		e.getDetails();
		e.printDetails();
	}

}
