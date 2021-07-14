package com.practice.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class A
{
	void show() throws IOException,Exception
	{
		System.out.println("Super class");
	}
}
class B extends A
{
	void show() throws FileNotFoundException,RuntimeException
	{
		System.out.println("Sub class of A");
	}
}
class C extends B
{
	void show()
	{
		System.out.println("Sub class of B");
	}
}
public class HierarchyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=(C) new A();
		obj.show();
	}

}
