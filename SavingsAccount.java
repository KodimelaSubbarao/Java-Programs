package com.sa.Assignments;

public class SavingsAccount extends Account
{
	private double interestRate;
	public SavingsAccount(String accountNumber,double balance,double interestRate)
	{
		super(accountNumber, balance);
		this.interestRate=interestRate;
	}
	@Override
	public Account generateStatement()
	{
		super.generateStatement();
		System.out.println("Interest Rate : "+interestRate);
		return  this;
	}
}
