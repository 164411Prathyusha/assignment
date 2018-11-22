package com.prathyusha.bank;

public class CurrentAccount extends BankAccount{
 private double odLimit;
 
 {
	 odLimit=20000;
 }
 public CurrentAccount(){
	 
 }
 public CurrentAccount(String accountHolderName, double accountBalance ){
		super(accountHolderName,accountBalance);
	}
 public double getOdLimit() {
	return odLimit;
}
 public void withdraw(double amount){
 	 //accountBalance-=amount;
 	 double remainingAmount;
 	 if(amount>this.accountBalance&&amount<(this.accountBalance+this.odLimit)){
 		 amount-=this.accountBalance;
 		 this.accountBalance=0;
 		 this.odLimit-=amount;
 	 }
         	 
 }
}
