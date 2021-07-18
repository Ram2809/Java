package com.practice.designPattern;

public class AnimalFactoryDemo {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		Animal a=AnimalFactory.getAnimalFactory("Cat");
		System.out.println(a);
		Animal b=AnimalFactory.getAnimalFactory("Dog");
		System.out.println(b);
		Animal c=AnimalFactory.getAnimalFactory("Lion");
		System.out.println(c);
		Animal d=AnimalFactory.getAnimalFactory("Lion1");
		System.out.println(d);
	}

}
