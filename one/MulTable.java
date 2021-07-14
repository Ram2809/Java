package com.practice.one;
import java.util.*;
import java.io.*;
public class MulTable {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+n+"="+i*n);
		}
	}

}
