package aop;

public class BankAccountServiceImpl implements BankAccountService{

	public double withdraw(long accountId, double balance) {
		double newBalance= BankAccountepositoryImpl.getBalance(accountId)-balance; 
		return 0;
	}

	public double deposit(long accountId, double balance) {
	
		return 0;
	}

	public double getBalance(long accountId) {
	
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		
		return false;
	}

}
