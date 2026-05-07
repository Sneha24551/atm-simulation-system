package com.oops;

import java.util.Scanner;

public class ATMSimulation {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Users Data like in database
		User[] users= {
				new User("SnehaLatha",1111, 1234, 50000),
				new User("Poojitha", 2222, 2345, 65000),
				new User("Vikram", 3333, 3456, 45000)
		};
		
		//Login
		System.out.println("Enter Account Number: ");
		int acc=sc.nextInt();
		
		System.out.println("Enter Pin: ");
		int pin=sc.nextInt();
		
		User currentUser=null;
		//Validate User
		for(User u: users) {
			if(u.getAccNo()==acc && u.getPin()== pin) {
				currentUser=u;
				break;
			}
		}
		
		if(currentUser==null) {
			System.out.println("Invalid Account Number or PIN");
			return;
		}
		
		//Creating ATM object
		
		ATM atm=new ATMImpl(currentUser);
		
		System.out.println("\nWelcome " + currentUser.getName());
		
		//Loop
		
		while(true) {
			System.out.println("\n---ATM MENU-----");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit ");
			System.out.println("4. Change PIN ");
			System.out.println("5. Exit ");

			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				atm.checkBalance();
				break;
				
			case 2:
				System.out.println("Enter amount to withdraw: ");
				double wAmt=sc.nextDouble();
				atm.withdraw(wAmt);
				break;
				
			case 3:
                System.out.print("Enter amount to deposit: ");
                double dAmt = sc.nextDouble();
                atm.deposit(dAmt);
                break;

            case 4:
                System.out.print("Enter new PIN: ");
                int newPin = sc.nextInt();
                atm.changePin(newPin);
                break;

            case 5:
                System.out.println("Thank you! Visit again.");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice!");	
			}

		}
	}
	
}
