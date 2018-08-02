package model;

import java.math.BigDecimal;

public class MoneyWalletPayment extends Payment {


	public MoneyWalletPayment(Account senderAccount, Account receiverAccount, BigDecimal currencyAmount,
			CredentialType credentialType, PaymentType paymentType) {
		super(senderAccount, receiverAccount, currencyAmount, credentialType, paymentType);
		// TODO Auto-generated constructor stub
	}

	@Override
	void transferMoney(Account sender, Account receiver, BigDecimal amount) {
		System.out.println("MoneyWallet is choosen !");
		System.out.println(amount + " will be transferred from " 
				+ sender.getAccountNumber() 
				+ " to "
				+ receiver.getAccountNumber());
		
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

}
