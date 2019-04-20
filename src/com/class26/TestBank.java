package com.class26;


public class TestBank {

	public static void main(String[] args) {
		Bank parent=new Bank();
		BankA child1=new BankA();
		BankB child2=new BankB();
		BankC child3=new BankC();
		
		parent.getBalance();
		child1.getBalance();
		child2.getBalance();
		child3.getBalance();
		
	}

}
