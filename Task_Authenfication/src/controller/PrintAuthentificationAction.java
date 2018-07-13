package controller;

import model.AuthentificationService;
import model.AuthentificationStrategy;
import model.CredentialType;
import model.EyeScanStrategy;
import model.FingerPrintStrategy;
import model.UserNameStrategy;
import view.PrintAuthentificationView;

public class PrintAuthentificationAction implements AuthentificationServiceAction {

	//Hard coded
	CredentialType credentialType = CredentialType.FINGERPRINT;
	AuthentificationStrategy authentificationStrategy;
	
	PrintAuthentificationView printInformationView;
	
	public PrintAuthentificationAction(CredentialType credentialType) {
		this.credentialType = credentialType;
		printInformationView = new PrintAuthentificationView();
	}
	
	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		
		switch(credentialType) {
		case FINGERPRINT:
			authentificationStrategy = new FingerPrintStrategy();
			printInformationView.showView(authentificationStrategy);
			break;
		case USERNAME:
			authentificationStrategy = new UserNameStrategy();
			printInformationView.showView(authentificationStrategy);
			break;
		case EYESCAN:
			authentificationStrategy = new EyeScanStrategy();
			printInformationView.showView(authentificationStrategy);
			break;
		}
		
		return authentificationService;
	}


}
