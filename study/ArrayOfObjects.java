package com.practice.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student
{
	Integer id;
	String name;
}
public class ArrayOfObjects {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Student[] obj=new Student[3];
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new Student();
		}
		System.out.println("Enter the student ids:");
		for(int i=0;i<obj.length;i++)
		{
			obj[i].id=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the student names:");
		for(int i=0;i<obj.length;i++)
		{
			obj[i].name=br.readLine();
		}
		/*obj[0].id=1;
		obj[1].id=2;
		obj[2].id=3;
		obj[0].name="Makesh";
		obj[1].name="Prakash";
		obj[2].name="Mani";*/
		System.out.println("The student details are:");
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i].id+"   "+obj[i].name);
		}
	}

}
