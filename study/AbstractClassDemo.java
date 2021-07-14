package com.practice.study;
class Cat extends Animal
{
	public String speak()
	{
		return "Meow Meow";
	}
}
class Dog extends Animal
{
	public String speak()
	{
		return "woow woow";
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Cat();
		a.show();
		System.out.println("Cat: "+a.speak());
		a=new Dog();
		System.out.println("Dog: "+a.speak());
	}

}
