package com.prathyusha.test;
import com.prathyusha.bank.*;
public class TestBankAccount {
            
	 public static void testBankAccountMethod(){
		 //BankAccount acc=new BankAccount();
		// acc.setAccoutHolderName("Bhuvaneswar");
	 }
	 public static void testSavingAccount() {
		/* SavingAccount savingAccount=new SavingAccount("Prathyusha",5000);
		 
		 System.out.println("Account no is"+savingAccount.getAccountNo());
		 System.out.println("Account holder name is:" +savingAccount.getAccoutHolderName());
		 System.out.println("Accoun Balance"+savingAccount.getAccountBalance());
		 savingAccount.deposit(5000);
		 System.out.println("Account Balance"+savingAccount.getAccountBalance());
		 System.out.println("============");
		 savingAccount.withdraw(3000);
		 System.out.println("Account Balance"+savingAccount.getAccountBalance());
		 System.out.println("Is Salary Account"+savingAccount.isSalaryAccount());*/
		 
		
	}
	public static void testCurrentAccount(){
		/* CurrentAccount currentAccount=new CurrentAccount("Prathyusha",40000);
		 System.out.println("Account no is"+currentAccount.getAccountNo());
		 System.out.println("Account holder name is:" +currentAccount.getAccoutHolderName());
		 System.out.println("Accoun Balance"+currentAccount.getAccountBalance());
		 //currentAccount.deposit(5000);
		// System.out.println("Account Balance"+currentAccount.getAccountBalance());
		 System.out.println("============");
		 currentAccount.withdraw(50000);
		 System.out.println("Account Balance"+currentAccount.getAccountBalance());
		 System.out.println("odLimit:"+currentAccount.getOdLimit());*/
		 
		
	}
	public static BankAccount getBankAccount(String accountType){
		BankAccount acc=null;
		if(accountType.equals("saving")){
			acc=new SavingAccount("Prathyusha",4000);
		}
		else if(accountType.equals("Current")){
			acc=new CurrentAccount("Bhuvaneswar",7000);
		}
		else{
			acc=null;
		}
		return acc;
	}
public static void main(String args[]){
    // testBankAccountMethod();
    // testSavingAccount();
     //testCurrentAccount();
	/*BankAccount acc=getBankAccount("current");
	System.out.println("Account Name"+acc.getAccoutHolderName());
	System.out.println("Account balance"+acc.getAccountBalance());
	acc.withdraw(3000);
	System.out.println("Account Balance"+acc.getAccountBalance());*/
	SavingAccountVersion2 acc=new SavingAccountVersion2();
	acc.withdraw(4000);
	acc.deposit(4000);
	acc.isSalaryAccount();
	acc.getInsuranceName();
    
}
}
