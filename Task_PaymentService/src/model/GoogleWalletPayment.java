package model;

import java.math.BigDecimal;

public class GoogleWalletPayment extends Payment {

	public GoogleWalletPayment(Account senderAccount, Account receiverAccount, BigDecimal currencyAmount,
			PaymentType paymentType, LanguageType languageType) {
		super(senderAccount, receiverAccount, currencyAmount, paymentType, languageType);
	}

	@Override
	void transferMoney(Account sender, Account receiver, BigDecimal amount) {
		System.out.println("GoogleWallet is choosen !");
		System.out.println(amount + " will be transferred from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}
}
