package com.practice.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Animal
{
	void show() throws IOException, InterruptedException
	{
		FileReader io=new FileReader("C:\\Users\\kumar\\Desktop\\Placement\\DBMS.txt");
		io.read();
		Thread.sleep(10000);
	}
}
class Cat extends Animal
{
	void show() throws FileNotFoundException
	{
		
	}
}
public class ExceptionWithOverriding {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.show();
		Cat c=new Cat();
		c.show();
	}

}
