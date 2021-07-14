package com.practice.exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c;
		
		try {
			c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Other part of the code");
		/*finally
		{
			System.out.println("FINALLY PART");
		}*/
		System.out.println("Other part of the code");
	}
}
