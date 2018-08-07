package model;

import java.math.BigDecimal;

import view.TransferPaymentView;

public class MoneyWalletPayment extends Payment {

	public MoneyWalletPayment(Account senderAccount, Account receiverAccount, BigDecimal currencyAmount,
			PaymentType paymentType, LanguageType languageType) {
		super(senderAccount, receiverAccount, currencyAmount, paymentType, languageType);
		// TODO Auto-generated constructor stub
	}

	@Override
	void transferMoney(Account sender, Account receiver, BigDecimal amount, LanguageType languageType) {
		TransferPaymentView transferPaymentView = new TransferPaymentView();

		if (languageType == LanguageType.GERMAN) {
			transferPaymentView.showViewGer(sender, receiver, amount, paymentType);
		} else if (languageType == LanguageType.ENGLISH) {
			transferPaymentView.showViewEng(sender, receiver, amount, paymentType);
		}

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
