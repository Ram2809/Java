package com.practice.one;

public class Bank {
	int balance=2500000;
	int deposit(int amount)
	{
		balance+=amount;
		return balance;
	}
	int withdraw(int amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			return balance;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		System.out.println(b.deposit(10000));
		System.out.println(b.withdraw(5000));
	}

}
