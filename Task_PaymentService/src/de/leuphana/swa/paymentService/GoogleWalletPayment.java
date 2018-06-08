package de.leuphana.swa.paymentService;

public class GoogleWalletPayment extends Payment {

	@Override
	void authenficateUser(CredentialType credentialType) {
		System.out.print("User is identified ");
				
			switch (credentialType) {
			case USERNAME:
				System.out.print("via Username\n");
				break;
			case FINGERPRINT:
				System.out.print("via fingerprint\n");
				break;
			case EYESCAN:
				System.out.print("via eyescan\n");
				break;
			default:
				break;
			}

	}

	@Override
	void confirmPayment() {
		System.out.println("transaction completed !");

	}

	@Override
	void transferMoney(Account sender, Account receiver, float amount) {
		System.out.println("GoogleWallet is choosen !");
		System.out.println(amount + " will be transferred from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());
	}

}
