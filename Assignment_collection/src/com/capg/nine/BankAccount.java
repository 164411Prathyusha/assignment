package com.capg.nine;

public class BankAccount {
private static int autoAccountNo;
	
	
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	

	{
		accountNo=++autoAccountNo;
	
	}
	public BankAccount(){
	
		accountHolderName="Unknow";
		accountBalance=0;
		//System.out.println("default constructor");
	}

	//Parameterized constructor
	public BankAccount(String accountHolderName, double accountBalance){
		
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		//System.out.println("Parameterized constructor");
	}
	
	//setter method-reinitialize|modify member variables 
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	//getter methods
	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	//service methods
	public void withdraw(double amount){
		if(checkNegativeAmount(amount)){
			System.out.println("Please, Enter valid Amount");
			return;
		}
			
		if(checkIsAmountGreater(amount)){
			System.out.println("You Don't Have Enough Balance. Please, Enter valid Amount");
			return;
		}
			
		if(!checkMinimumBalanceAfterAmountDeduction(amount)){
			System.out.println("Please, Enter valid Amount");
			return;
		}
		
		if(checkAccountBalance()){
			System.out.println("Please, Enter valid Amount");
			return;
		}
			
		this.accountBalance-=amount;
	}
	
	public void deposit(double amount){
		if(checkNegativeAmount(amount)){
			System.out.println("Please, Deposit valid Amount");
			return;
		}
		
		this.accountBalance+=amount;
	}
	
	public boolean checkNegativeAmount(double amount){
		if(amount<=0)
			return true;
		return false;
	}
	
	public boolean checkIsAmountGreater(double amount){
		if(amount>this.accountBalance)
			return true;
		return false;
	}
	
	public boolean checkMinimumBalanceAfterAmountDeduction(double amount){
		double minimumBalance=this.accountBalance-amount;
		if(minimumBalance>=1000)
			return true;
		return false;
	}
	
	public boolean checkAccountBalance(){
		if(this.accountBalance==1000)
			return true;
		return false;
	}
	
}
