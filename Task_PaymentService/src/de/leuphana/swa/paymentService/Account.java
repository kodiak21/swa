package de.leuphana.swa.paymentService;

public class Account {
	
	private int accountNumber;
	
	private float amount;
	
	public Account(int accountNumber) {
		this.accountNumber= accountNumber;
	}


	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
}
