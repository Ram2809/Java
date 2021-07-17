package com.practice.multithreading;

class Account
{
	int accNo;
	String accName;
	double accBalance;
	public Account(int accNo, String accName, double accBalance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	void deposit(int deposit)
	{
		accBalance+=deposit;
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		accBalance+=deposit;
		System.out.println("Deposit is successful!");
	}
	void withdraw(int withdraw)
	{
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(accBalance<=withdraw)
		{
			System.out.println("Insufficeient Balance!");
		}
		else
		{
			accBalance-=withdraw;
			System.out.println("Withdraw Successful!");
		}
	}
	  void display()
	{
		try
		{
			Thread.sleep(555);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(accNo+" "+accName+" "+accBalance);
	}
}
class User1 extends Thread
{
	Account a;

	public User1(Account a) {
		super();
		this.a = a;
	}
	public void run()
	{
		a.deposit(1000);
		a.withdraw(500);
		a.display();
	}
}
class User2 extends Thread
{
	Account a;

	public User2(Account a) {
		super();
		this.a = a;
	}
	public void run()
	{
		a.deposit(1000);
		a.withdraw(500);
		a.display();
	}
}
public class SynchroniationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account(1000481121,"Revature Join Account",500000);
		User1 u1=new User1(obj);
		User2 u2=new User2(obj);
		u1.start();
		u2.start();
	}

}
