package model;

public class Account {
	
	private int accountNumber;
	
	private float amount;
	
	public Account(int accountNumber) {
		this.accountNumber= accountNumber;
		this.amount= 0;
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
