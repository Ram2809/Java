package com.practice.one;

public class Account {
	int accNo;
	String accType;
	int accBalance;
	public void setAccountDetails()
	{
		accNo=63374759;
		accType="Saving";
		accBalance=100000;
	}
	public void withdraw()
	{
		accBalance-=1000;
		System.out.println("Balance after withdraw:"+accBalance);
	}
	public void deposit()
	{
		accBalance=accBalance+1000;
		System.out.println("Balance after deposit:"+accBalance);
	}
	public void dispAccoutDetails()
	{
		System.out.println("Account No.:"+accNo);
		System.out.println("Account type:"+accType);
		System.out.println("Account Balance:"+accBalance);
	}
}
