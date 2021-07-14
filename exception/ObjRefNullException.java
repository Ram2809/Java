package com.practice.exception;

public class ObjRefNullException {
	public void show()
	{
		System.out.println("This is my exception example!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ObjRefNullException o=null;
			o.show();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}

}
