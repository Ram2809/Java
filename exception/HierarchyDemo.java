package com.practice.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class HierarchyDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try(FileReader io=new FileReader("C:\\Users\\kumar\\Desktop\\Placement\\DBMS_.txt"))
		{
			//io=new FileReader("C:\\Users\\kumar\\Desktop\\Placement\\DBMS_.txt");
			io.read();
			Thread.sleep(10000);
		}
		catch(FileNotFoundException e)//subclass of IOException
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}

}
