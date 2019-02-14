package third;

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

	public double updateBalance(long accountId, double newBalance, String type) {
		BankAccount acc= getAccountMethod(accountId);
		if(acc!=null)
			if(type.equals("withdraw")){
				acc.setAccountBalance(acc.getAccountBalance()-newBalance);
			}
			else if(type.equals("deposit")){
				acc.setAccountBalance(acc.getAccountBalance()+newBalance);
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

	public double updateBalance(long accountId, double newBalance) {
		
		return 0;
	}

}
