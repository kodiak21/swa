package model;

public class MoneyWalletPayment extends Payment {


	public MoneyWalletPayment(Account senderAccount, Account receiverAccount, float currencyAmount,
			CredentialType credentialType, PaymentType paymentType) {
		super(senderAccount, receiverAccount, currencyAmount, credentialType, paymentType);
		// TODO Auto-generated constructor stub
	}

	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
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
