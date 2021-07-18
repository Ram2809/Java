package com.practice.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Student
{
	Integer stu_id;
	String name;
	Integer stu_marks;
	public Student(Integer stu_id, String name, Integer stu_marks) {
		super();
		this.stu_id = stu_id;
		this.name = name;
		this.stu_marks = stu_marks;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + name + ", stu_marks=" + stu_marks + "]";
	}
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		if(this.stu_marks>s.stu_marks)
			return +1;
		else if(this.stu_marks<s.stu_marks)
			return -1;
		return 0;
	}
	//@Override
	/*public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		return this.name.compareTo(s.name);
	}*/
	
}
public class Collections {
	public static void main(String...arsg)
	{
		List a=new ArrayList();
		a.add(100);
		a.add(50);
		a.add(90);
		Collections.sort(a);
		System.out.println(a);
		List<Student> sList=new ArrayList<Student>();
		sList.add(new Student(1,"Ram",100));
		sList.add(new Student(101,"Alia",19));
		sList.add(new Student(1234,"Shreya",29));
	Collections.sort(sList);
	Iterator i=sList.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
		//System.out.println(sList);
	}

	private static void sort(List<Student> sList) {
		// TODO Auto-generated method stub
		
	}
}
