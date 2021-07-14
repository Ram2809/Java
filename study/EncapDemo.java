package com.practice.study;

public class EncapDemo {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapDemo ed=new EncapDemo();
		ed.setId(6581);
		ed.setName("Ramkumar");
		System.out.println(ed.getId()+" "+ed.getName());
	}

}
