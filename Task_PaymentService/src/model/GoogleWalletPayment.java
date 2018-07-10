package model;

import de.leuphana.swa.authentificationService.CredentialType;

public class GoogleWalletPayment extends Payment {

	PaymentType paymentType;
	
	public GoogleWalletPayment(Account senderAccount, Account receiverAccount, float currencyAmount,
			CredentialType credentialType, PaymentType paymentType) {
		super(senderAccount, receiverAccount, currencyAmount, credentialType, paymentType);
	}

	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
		System.out.println("GoogleWallet is choosen !");
		System.out.println(amount + " will be transferred from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

}
