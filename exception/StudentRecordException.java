package com.practice.exception;

import java.util.Scanner;

public class StudentRecordException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int id[]=new int[10];
		String name[]=new String[10];
		try
		{
			System.out.println("Enter the roll nos of the student:");
			for(int i=0;i<id.length;i++)
			{
				id[i]=s.nextInt();
			}
			System.out.println("Enter the names of the students:");
			for(int i=0;i<name.length;i++)
			{
				name[i]=s.next();
			}
			System.out.println("Roll No"+"    "+"Name");
			System.out.println("---------------------");
			for(int i=0;i<10;i++)
			{
				System.out.println(id[i]+"           "+name[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

}
