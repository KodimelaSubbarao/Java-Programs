package com.sa.Assignments;

public class CheckingAccount extends Account
{
	private double overdraftLimit ;

	public CheckingAccount(String accountNumber,double balance,double overdraftLimit)
	{
		super(accountNumber, balance);
		this.overdraftLimit=overdraftLimit;
	}

	@Override
	public CheckingAccount generateStatement()
	{
		super.generateStatement();
		System.out.println("Overdraft Limit  : "+overdraftLimit);
		return  this;
	}
}
