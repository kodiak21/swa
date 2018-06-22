package de.leuphana.swa.paymentService;

import de.leuphana.swa.authentificationService.CredentialType;

public class GoogleWalletPayment extends Payment {

	public GoogleWalletPayment(Account senderAccount, Account receiverAccount, float currencyAmount,
			CredentialType credentialType) {
		super(senderAccount, receiverAccount, currencyAmount, credentialType);
		// TODO Auto-generated constructor stub
	}

	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
		System.out.println("GoogleWallet is choosen !");
		System.out.println(amount + " will be transferred from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());
	}

}
