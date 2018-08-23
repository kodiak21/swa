package view;

import model.AuthentificationStrategy;
import model.CredentialType;

public class PrintAuthentificationView {

	public void showViewGer(AuthentificationStrategy authentificationStrategy) {

		System.out.println(authentificationStrategy.authenficateSubjectGer());
		
		CredentialType strategyType = authentificationStrategy.getCredentialType();

		switch (strategyType) {
		case EYESCAN:
			System.out.println("Identifiziert ueber EyeScan");
			
			break;
		case FINGERPRINT:
			System.out.println("Identifiziert ueber FingerPrint");
	
			break;
		case USERNAME:
			System.out.println("Identifiziert ueber Username");
			
			break;
		default:
			break;
		}
		
		

	}

	public void showViewEng(AuthentificationStrategy authentificationStrategy) {
		CredentialType strategyType = authentificationStrategy.getCredentialType();

		System.out.println(authentificationStrategy.authenficateSubjectEng());
		
		switch (strategyType) {
		case EYESCAN:
			System.out.println("Identified by EyeScan");

			break;
		case FINGERPRINT:
			System.out.println("Identified by FingerPrint");

			break;
		case USERNAME:
			System.out.println("Identified by Username");

			break;
		default:
			break;
		}

		

	}
}
