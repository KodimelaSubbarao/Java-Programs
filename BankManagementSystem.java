package com.sa.Assignments;

public class BankManagementSystem {

	public static void main(String[] args)
	{
		SavingsAccount sa=new SavingsAccount("SA123", 25000.0, 2.5);
		sa.generateStatement();
		System.out.println();
		CheckingAccount ca=new CheckingAccount("Subbu123", 18888.00,500);
		ca.generateStatement();
	}

}
