package com.practice.study;
class School
{
	int id;
	String address;
	int studentCount;
}
class SRMSchool extends School
{
	public void getDetails()
	{
		id=101;
		address="Chennai";
		studentCount=2500;
	}
	public void printDetails()
	{
		System.out.println(id+" "+address+" "+studentCount);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SRMSchool obj=new SRMSchool();
		obj.getDetails();
		obj.printDetails();
	}

}
