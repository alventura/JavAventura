package com.class26;

public class Bank {
	public void getBalance() {
		int amount=0;
		System.out.println(amount);
	}
	
}

class BankA extends Bank{
	public void getBalance() {
		int amount=1000;
		System.out.println("Bank A: "+amount);
	}
}
class BankB extends Bank{
	public void getBalance() {
		int amount=1500;
		System.out.println("Bank B: "+amount);	
}
}
class BankC extends Bank{
	public void getBalance() {
		int amount=2000;
		System.out.println("Bank C: " +amount);
	}
}
