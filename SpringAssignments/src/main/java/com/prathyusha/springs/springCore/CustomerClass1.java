package com.prathyusha.springs.springCore;

public class CustomerClass1 {
	private long customerId;
	private String customerName;
	private long customerContact;
	AddressClass1 customerAddress;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public AddressClass1 getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(AddressClass1 customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "CustomerClass1 [customerId=" + customerId + ", customerName="
				+ customerName + ", customerContact=" + customerContact
				+ ", customerAddress=" + customerAddress + "]";
	}
	
}
