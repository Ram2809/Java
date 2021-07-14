package com.practice.exception;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{ 
			try {
				System.out.println(10/0);//Arithmetic Exception}
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			try
			{
				int[] arr= {8,9,10,11,23};
				System.out.println(arr[10]);//ArrayIndexOutOfBounds Exception
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			try {
				String str=null;
				System.out.println(str.toUpperCase());//Null Pointer Exception
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			try
			{
				String s="Revature";
				System.out.println(s.charAt(9));//StringIndexOutOfBounds Exception
			}
			catch(StringIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			String s="Revature";
			int x=Integer.parseInt(s);
			System.out.println(x);//Number format exception
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		/*
		*/
		System.out.println("Rest of the code");
	}

}
