package com.practice.exception;
class Base
{
	Base() throws Exception
	{
		
	}
}
class Derived extends Base
{

	Derived() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class ConstructorException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Derived obj=new Derived();
	}

}
