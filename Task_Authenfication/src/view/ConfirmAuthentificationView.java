package view;

import model.AuthentificationStrategy;
import model.CredentialType;

public class ConfirmAuthentificationView {

	public void showViewGer(AuthentificationStrategy authentificationStrategy) {
		CredentialType credentialType = authentificationStrategy.getCredentialType();

		switch (credentialType) {
		case EYESCAN:
			System.out.println("Sie haben die Option Eyescan gewählt");

			break;
		case FINGERPRINT:
			System.out.println("Sie haben die Option Fingerprint gewählt");

			break;
		case USERNAME:
			System.out.println("Sie haben die Option Passwort gewählt");

			break;
		default:
			break;
		}

	}

	public void showViewEng(AuthentificationStrategy authentificationStrategy) {
		CredentialType credentialType = authentificationStrategy.getCredentialType();

		switch (credentialType) {
		case EYESCAN:
			System.out.println("You have chosen EyeScan");

			break;
		case FINGERPRINT:
			System.out.println("You have chosen Fingerprint");

			break;
		case USERNAME:
			System.out.println("You have chosen Username");

			break;
		default:
			break;
		}

	}

}