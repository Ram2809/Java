package com.practice.designPattern;
class Demo implements Cloneable
{
	int demo_id=100;

	public Demo(int demo_id) {
		super();
		this.demo_id = demo_id;
	}
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Demo [demo_id=" + demo_id + "]";
	}
	protected void finalize()
	{
		demo_id=0;
	}
}
public class Prototyping {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Demo obj=new Demo(100);
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		Demo obj1=(Demo)obj.clone();
		System.out.println(obj.equals(obj1));
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj.hashCode());
		System.out.println(obj.hashCode());
	}

}
