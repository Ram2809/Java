package com.practice.study;
class Employee1
{
	int empid;
	String empname;
	String dob;
	String address;
	double salary;
	String team;
	static int count=0;
	/*Employee1()//default constructor,JVM invokes whenever the new object is created
	{
		
	}*/
	/*Employee1()//EMPTY CONSTRUCTOR
	{
		count++;
		System.out.println("Welcome to Revature");
	}*/
	Employee1()//empty constructor
	{
		count++;
		empid=1001;
		empname="Makesh";
		dob="17-02-2000";
		address="Villupuram";
		salary=50000.25;
	}
	void show()
	{
		
	}
	void display()
	{
		this.show();//this.method
		System.out.println(empid+" "+empname+" "+dob+" "+address+" "+salary);
	}
	public Employee1(int empid, String empname, String dob, String address, double salary) {//parameterized Constructor
		super();
		count++;
		this.empid = empid;
		this.empname = empname;
		this.dob = dob;
		this.address = address;
		this.salary = salary;
	}

	public Employee1(int empid, String empname, double salary) {
		this();//constructor chaining
		this.empid = empid;//this varibale
		this.empname = empname;
		this.salary = salary;
		count++;
	}

	public Employee1(String dob, String address) {
		this(456,"Mohan",100000.89);//constructor chaining
		this.dob = dob;
		this.address = address;
		count++;
	}

	public Employee1(int empid, String empname, String dob, String address, double salary, String team) {
		this(empid,empname,dob,address,salary);//this constructor
		this.team = team;
		count++;
	}
	public  Employee1 updateEmpInfor(Employee1 e)//passing object as a argument to a method
	{
		Employee1 obj=new Employee1();
		obj.empid=e.empid;
		obj.empname=e.empname;
		obj.dob=e.dob;
		obj.address=e.address;
		obj.salary=e.salary;
		obj.team=e.team;
		return obj;
	}
	
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c=new ConstructorDemo();
		Employee1 e=new Employee1();
		e.display();
		Employee1 e1=new Employee1(101,"Prakash","01-08-2021","TVM",50000.96);
		e1.display();
		Employee1 e2=new Employee1(341,"Mani",30000.96);
		e2.display();
		Employee1 e4=new Employee1("10-05-2000","Dharamapuri");
		e4.display();
		Employee1 e3=new Employee1(101,"Prakash","01-08-2021","TVM",50000.96,"Testing");
		e3.display();
		System.out.println(e3.team);
		System.out.println(Employee1.count);
		Employee1 e5=e3.updateEmpInfor(e3);
		e5.display();
	}

}
