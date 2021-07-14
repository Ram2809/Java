package com.practice.one;

public class Executive extends Manager1 {
	String sample="Executive";
	

	@Override
	public String toString() {
		return "Executive [sample=" + sample + ", EmpDept=" + EmpDept + ", empName=" + empName + ", empSalary="
				+ empSalary + "]";
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager1 m=new Manager1();
		System.out.println(m);
		Executive e=new Executive();
		System.out.println(e);
	}

}
