package com.oops;

public class ATMImpl implements ATM{
	
	private User user;
	
	public ATMImpl(User user) {
		this.user=user;
	}
	
	@Override
	public void checkBalance() {
		System.out.println("Current Balance: "+user.getBalance());
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount!");
		} else if (amount<=user.getBalance()){
			user.setBalance(user.getBalance()-amount);
			System.out.println("Withdraw Successful");
		}else {
			System.out.println("Insufficient amount");
		}
	}
	
	@Override
	public void deposit(double amount) {
		if(amount>0) {
			user.setBalance(user.getBalance()+amount);
			System.out.println("Deposit Sucessful");
		}else {
			System.out.println("Invalid amount!");
		}
	}
	
	@Override
	public void changePin(int newPin) {
		user.setPin(newPin);
		System.out.println("Pin Changed Sucessful");
	}
	

}
