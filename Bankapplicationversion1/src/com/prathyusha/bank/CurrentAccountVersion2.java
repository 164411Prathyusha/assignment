package com.prathyusha.bank;

public class CurrentAccountVersion2 extends CurrentAccount implements Insurance {
             @Override
            public String getInsuranceName() {
            	// TODO Auto-generated method stub
            	return "Insurance Bhima";
            }
             @Override
            public double getInsuranceAccount() {
            // TODO Auto-generated method stub
            return 500000;
            }
}
