package com.practice.study;
class Bank
{
	int branchID;
	String bankName;
	String branch;
	String ifsc;
	String address;
	void setBankDetails()
	{
		branchID=1002;
		bankName="ICICI";
		branch="Teynampet";
		ifsc="ICIB561K002";
		address="Chennai";
	}
	void printBankDetails()
	{
		System.out.println(branchID+" "+bankName+" "+branch+" "+ifsc+" "+address);
	}
}
class AccountPersonal extends Bank
{
	int accNo;
	String name;
	String dob;
	String address;
	void setPersonalDetails()
	{
		accNo=1255466666;
		name="Rahul R";
		dob="28-07-1987";
		address="Salem";
	}
	void printPersonalDetails()
	{
		System.out.println(accNo+" "+name+" "+dob+" "+address);
	}
}
class LoanPersonal extends AccountPersonal
{
	int loanID;
	double loanAmount;
	void setLoanDetails()
	{
		loanID=19870;
		loanAmount=100000;
	}
	void printLoanDetails()
	{
		System.out.println(loanID+" "+loanAmount);
	}
}
public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanPersonal l=new LoanPersonal();
		l.setBankDetails();
		l.setPersonalDetails();
		l.setLoanDetails();
		l.printBankDetails();
		l.printPersonalDetails();
		l.printLoanDetails();
	}

}
