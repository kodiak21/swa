package de.leuphana.swa.paymentService;

public class MoneyWalletPayment extends Payment {


	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
		System.out.println("MoneyWallet is choosen !");
		System.out.println(amount + " will be transferred from " 
				+ sender.getAccountNumber() 
				+ " to "
				+ receiver.getAccountNumber());
		
	}

}
