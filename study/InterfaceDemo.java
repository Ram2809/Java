package com.practice.study;
class HousingLoan implements Interest,Documents
{
	public float getInterest()
	{
		return 10.4f;
	}
	public void getSupportingDoucments()
	{
		System.out.println("Document of house");
	}
}
class EducationLoan implements Interest,Documents
{
	public float getInterest()
	{
		return 1.2f;
	}
	public void getSupportingDoucments()
	{
		System.out.println("Educational documents and fee structure");
	}
}
class JewelLoan implements Interest,Documents
{
	public float getInterest()
	{
		return 7.6f;
	}
	public void getSupportingDoucments()
	{
		System.out.println("No document needed");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest i;
		HousingLoan l=new HousingLoan();
		i=l;
		i.printMessage();
		System.out.println("Interest for given period:"+Interest.calTotalInterest(6.7f,24));
		System.out.println("Interest for housing loan:"+i.getInterest());
		Documents d=new HousingLoan();
		d.getSupportingDoucments();
		i=new EducationLoan();
		System.out.println("Interest for education loan:"+i.getInterest());
		d=new EducationLoan();
		d.getSupportingDoucments();
		i=new JewelLoan();
		System.out.println("Interest for jewel loan:"+i.getInterest());
		d=new JewelLoan();
		d.getSupportingDoucments();
	}

}
