package view;

import model.AuthentificationStrategy;
import model.CredentialType;

public class PrintAuthentificationView {

	public void showViewGer(AuthentificationStrategy authentificationStrategy) {
		
		CredentialType strategyType = authentificationStrategy.getCredentialType();

		switch (strategyType) {
		case EYESCAN:
			System.out.println("\t**********************************");
			System.out.println("\tIdentifiziert ueber EyeScan");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case FINGERPRINT:
			System.out.println("\t**********************************");
			System.out.println("\tIdentifiziert ueber FingerPrint");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case USERNAME:
			System.out.println("\t**********************************");
			System.out.println("\tIdentifiziert ueber Username");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		default:
			break;
		}
		
		

	}

	public void showViewEng(AuthentificationStrategy authentificationStrategy) {
		CredentialType strategyType = authentificationStrategy.getCredentialType();
		
		switch (strategyType) {
		case EYESCAN:
			System.out.println("\t**********************************");
			System.out.println("\tIdentified by EyeScan");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case FINGERPRINT:
			System.out.println("\t**********************************");
			System.out.println("\tIdentified by FingerPrint");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		case USERNAME:
			System.out.println("\t**********************************");
			System.out.println("\tIdentified by Username");
			System.out.println("\t**********************************");
			System.out.println("");
			break;
		default:
			break;
		}

		

	}
}
