package com.oop;

public class Accountshape {
public static void main(String[] args) {
	 Account a = new Account();
	 
	 a.setNumber("59090053640");
	 a.setType("current");
	 a.setBalance(2000);
	
	 System.out.println("account no.=" +(a.getNumber()));
	 System.out.println("account type =" +(a.getType()));
	System.out.println("balance =" +(a.getBalance()));
	
	
}
}
