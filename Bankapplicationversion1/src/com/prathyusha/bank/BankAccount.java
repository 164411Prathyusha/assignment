package com.prathyusha.bank;

public abstract class BankAccount {
   //static variable
	private static int autoAccountNo;
	 // instance variable
		private static int accountNo;
		private String accoutHolderName;
		protected double accountBalance;
		//init block reduce the redundancy of the code
		{
     //System.out.println("init block");
			accountNo=++autoAccountNo;
		}
		
		// default constructor
   public BankAccount(){
	
	 accoutHolderName = "unknown";
	 accountBalance=0;
	// System.out.println("default constructor");
   }
  
	 //parameterized constructor overloading
	 public BankAccount(String accoutHolderName,double accountBalance){
		
		//setter method --modify/re-intialise member variable
		 
		 this.accoutHolderName =accoutHolderName;
		 this.accountBalance=accountBalance;
		// System.out.println("parameterized constructor");
	 }
 //setter method
	public void setAccoutHolderName(String accoutHolderName) {
		this.accoutHolderName = accoutHolderName;
	}
	//getter methods
	 public static int getAccountNo() {
		return accountNo;
	}
	 public String getAccoutHolderName() {
		return accoutHolderName;
	}
	 public double getAccountBalance() {
		return accountBalance;
	}
	 
	 //service methods
	 public void withdraw(double amount){
		 if(checkNegativeNum(amount)){
			 System.out.println("Enter valid number");
			 return;
		 }
		 if(checkGreaterNum(amount)){
			 System.out.println("Enter current amount available in account");
			 return;
		 }
		 if(checkMinBlnc(amount)){
			 System.out.println("Check Minimum balance");
			 return;
		 }
		 if(checkLessNum(amount)){
			 System.out.println("Please, Enter minimum amt to withdraw");
			 return;
		 }
		 this.accountBalance-=amount;
		 
	 }
	 public void deposit(double amount){
		 if(checkNegativeNum(amount)){
			 System.out.println("Enter valid number");
			 return;
		 }
		 this.accountBalance+=amount;
	 }
	 public boolean checkNegativeNum(double amount){
		 if(amount<0){
			return true;
		 }
		return false;
	 }
	 public boolean checkGreaterNum(double amount){
		 if(amount>this.accountBalance){
			 return true;
		 }
		 return false;
	 }
	 public boolean checkMinBlnc(double amount){
		 if(amount==1000){
			 return true;
		 }
		 return false;
	 }
	 public boolean checkLessNum(double amount){
		 if(amount<100){
			 return true;
		 }
		 return false;
	 }
	 public static void main(String[] args) {
		 //at the time of object creation constructor gets call
		//BankAccount acc=new BankAccount();
		//BankAccount acc1=new BankAccount("prathyusha",1500);
		//acc1.withdraw(2000);
		//acc1.deposit(-1);
	}
	

}
