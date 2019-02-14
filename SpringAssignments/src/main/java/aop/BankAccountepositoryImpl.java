package aop;

import java.util.List;

public class BankAccountepositoryImpl implements BankAccountRepository{
  List<BankAccount> account=null;
  
	public BankAccountepositoryImpl() {
	super();
}

	public BankAccountepositoryImpl(List<BankAccount> account) {
	super();
	this.account = account;
          }

	public double getBalance(long accountId) {
		BankAccount acc= getAccountMethod(accountId);
		if(acc!= null)
			return acc.getAccountBalance();
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		BankAccount acc= getAccountMethod(accountId);
		if(acc!=null){
			 acc.setAccountBalance(newBalance);
		return acc.getAccountBalance();
		}
		return 0;
	}
	private BankAccount getAccountMethod(long accountId){
		if(account!=null){
			for(BankAccount acc: account){
				if(acc.getAccountId()==accountId){
					return acc;
				}
			}
		}
		return null;
	}

	public List<BankAccount> getAccount() {
		return account;
	}

	public void setAccount(List<BankAccount> account) {
		this.account = account;
	}

	

	

}
