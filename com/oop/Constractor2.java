package com.oop;

public class Constractor2 {
	private String name;
	private String dob;
	private String address;
	
	public Constractor2(String n, String d , String a) {
		name = n;
		dob = d;
		address = a;
		System.out.println(name+" "+dob+" "+address);
		
	}

	public String getName() {
		return name;   
	}

	public String getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}
	
	
	

}
