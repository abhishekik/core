package com.oop;

public class Testperson {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("anshuman");
		
		p.setDateofbirth("15.02.2000");
		
		p.setAddress("indore");
		
		System.out.println("name="+ (p.getName()));
		System.out.println("Dateofbirth="+(p.getDateofbirth()));
		System.out.println("address="+(p.getAddress()));
	}

}
