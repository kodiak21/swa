package de.leuphana.swa.paymentService;

import de.leuphana.swa.authentificationService.CredentialType;

public class MoneyWalletPayment extends Payment {


	public MoneyWalletPayment(Account senderAccount, Account receiverAccount, float currencyAmount,
			CredentialType credentialType) {
		super(senderAccount, receiverAccount, currencyAmount, credentialType);
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

}
