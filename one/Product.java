package com.practice.one;

public class Product {
	int productNo;
	String productName;
	float price;
	int quantity;
	public void getProductDetails()
	{
		productNo=101;
		productName="Chocolate";
		price=(float)34.5;
		quantity=100;
	}
	public void dispProductDetails()
	{
		System.out.println("Product No"+"          "+"Product Name"+"        "+"Quantity"+"        "+"Price"+"        "+"Total Amount");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println(productNo+"              "+productName+"            "+quantity+"         "+price+"          "+(quantity*price));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.getProductDetails();
		p.dispProductDetails();
	}

}
