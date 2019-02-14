package com.capg.nine;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<SavingAccount> bank=new HashSet<SavingAccount>();
		System.out.println(bank.add(new SavingAccount("Prathyusha", 50000, true)));
		System.out.println(bank.add(new SavingAccount("Vinee", 60000, true)));
		System.out.println(bank.add(new SavingAccount("Neelima", 50000, true)));
		System.out.println(bank.add(new SavingAccount("Salma", 70000, true)));
		
		Set<SavingAccount> sorted=new TreeSet<SavingAccount>(bank);
		
		Iterator<SavingAccount> iterator=sorted.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getAccountHolderName());
		}
	}
}
