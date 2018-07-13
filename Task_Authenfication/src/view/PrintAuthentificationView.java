package view;

import model.AuthentificationStrategy;
import model.CredentialType;
import model.EyeScanStrategy;
import model.FingerPrintStrategy;
import model.UserNameStrategy;

public class PrintAuthentificationView {

	private AuthentificationStrategy authentificationStrategy;

	public void showView( AuthentificationStrategy authentificationStrategy) {

		System.out.println(authentificationStrategy.authenficateSubject());

	}
}
