package com.practice.lambda;
interface mul//No parameter
{
	public abstract void show();
}
@FunctionalInterface
interface sample//single parameter
{
	public abstract void disp(int id);
}
interface sample1//two parameter
{
	public String conCat(String s1,String s2);
}
public class ParametersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul m1;
		m1=()->{System.out.println("Hi");};
		m1.show();
		sample s=(a)->{System.out.println(Math.sqrt(a));};
		s.disp(12);
		sample1 s1=(a,b)->{String s3=a.concat(b);
		return s3;
		};
		System.out.println(s1.conCat("Revature ","Training"));
		}
	}


