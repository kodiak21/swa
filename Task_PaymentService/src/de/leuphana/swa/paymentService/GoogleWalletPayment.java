package de.leuphana.swa.paymentService;

public class GoogleWalletPayment extends Payment {

	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
		System.out.println("GoogleWallet is choosen !");
		System.out.println(amount + " will be transferred from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());
	}

}
