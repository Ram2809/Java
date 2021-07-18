package com.practice.designPattern;

public class AnimalFactory {
	public static Animal getAnimalFactory(String str) throws CustomException
	{
		switch(str)
		{
			case "Cat":
			{
				return new Cat();
			}
			case "Dog":
			{
				return new Dog();
			}
			case "Lion":
			{
				return new Lion();
			}
			default:
				throw new CustomException("Enter a valid choice!");
		}
	}
}
