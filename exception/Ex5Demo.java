package com.practice.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

class A {//super class
	void show() throws InterruptedException,FileNotFoundException ,ClassNotFoundException//overriding method
	{
		
	}
}
/*class X extends Ex5Demo {
	void show()  {
		
	}
}*/

public class Ex5Demo extends A{
     @Override                     //checked exception 
	void show() throws InterruptedException//FileNotFoundException //,ClassNotFoundException overloading method 
	{
		
    	/*Thread.sleep(500);
		FileReader f=new FileReader("E:\\Demo.java");
		//int a[]= {3,4,5};
		//System.out.println(a[9]);*/
	}
	
	public static void main(String[] args) throws InterruptedException ,FileNotFoundException
	{
		
		Ex5Demo e=new Ex5Demo();
		e.show();
	}

}