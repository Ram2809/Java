package com.practice.study;

public class GarbageCollectorAndObjectClassDemo implements Cloneable {
	private int id=100;
	
	public Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public String toString() {
		return "GarbageCollectorDemo [id=" + id + "]";
	}
	public void finalize()
	{
		id=0;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		GarbageCollectorAndObjectClassDemo obj=new GarbageCollectorAndObjectClassDemo();
		GarbageCollectorAndObjectClassDemo obj1=new GarbageCollectorAndObjectClassDemo();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj1));
		System.out.println(obj);
		GarbageCollectorAndObjectClassDemo obj2=(GarbageCollectorAndObjectClassDemo)obj1.clone();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj2.equals(obj1));
		System.gc();
		Runtime.getRuntime().gc();
		System.runFinalization();
	}

}
