package com.prathyusha.bank;

public class SavingAccountVersion2 extends SavingAccount implements Insurance{
  
	public String getInsuranceName(){
		return "Jivan Bima";
	}
	
	@Override
	public double getInsuranceAccount() {
		// TODO Auto-generated method stub
		return 500000;
	}
	
}
