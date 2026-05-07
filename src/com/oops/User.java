package com.oops;

public class User {
	private String name;
	private int accNo;
	private int pin;
	private double balance;
	
	//Constructor
	public User(String name, int accNo, int pin, double balance) {
		this.name=name;
		this.accNo=accNo;
		this.pin=pin;
		this.balance=balance;
		
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public int getPin() {
		return pin;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//Setters
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
}
