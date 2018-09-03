package view;

import model.AuthentificationStrategy;
import model.CredentialType;

public class ConfirmAuthentificationView {

	public void showViewGer(AuthentificationStrategy authentificationStrategy) {
		CredentialType credentialType = authentificationStrategy.getCredentialType();

		switch (credentialType) {
		case EYESCAN:
			System.out.println("\t**********************************");
			System.out.println("\tSie haben die Option");
			System.out.println("\tEyescan gewaehlt");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case FINGERPRINT:
			System.out.println("\t**********************************");
			System.out.println("\tSie haben die Option");
			System.out.println("\tFingerprint gewaehlt");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case USERNAME:
			System.out.println("\t**********************************");
			System.out.println("\tSie haben die Option");
			System.out.println("\tPasswort gewaehlt");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		default:
			break;
		}

	}

	public void showViewEng(AuthentificationStrategy authentificationStrategy) {
		CredentialType credentialType = authentificationStrategy.getCredentialType();

		switch (credentialType) {
		case EYESCAN:
			System.out.println("\t**********************************");
			System.out.println("\tYou have chosen EyeScan");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case FINGERPRINT:
			System.out.println("\t**********************************");
			System.out.println("\tYou have chosen Fingerprint");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case USERNAME:
			System.out.println("\t**********************************");
			System.out.println("\tYou have chosen Username");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		default:
			break;
		}

	}

}
