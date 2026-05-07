package com.oops;

public interface ATM {
	
	void checkBalance();
	void withdraw(double amount);
	void deposit(double amount);
	void changePin(int newPin);

}
