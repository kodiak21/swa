package controller;

import model.AuthentificationService;
import model.CredentialType;
import model.Person;
import view.QuestionCredentialTypeView;

public class CreateAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	QuestionCredentialTypeView questionCredentialTypeView;

	public CreateAuthentificationAction(Person person) {
		this.person = person;
		this.questionCredentialTypeView = new QuestionCredentialTypeView();
	}
	
	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		CredentialType credentialType;
		
		int answer = questionCredentialTypeView.showView();
		
		switch(answer) {
		case 1:
			credentialType = CredentialType.FINGERPRINT;
			break;
		case 2:
			credentialType = CredentialType.USERNAME;
			break;
		case 3:
			credentialType = CredentialType.EYESCAN;
			break;
		default:
			credentialType = null;	
		}
		
		authentificationService.createAuthentification(credentialType, person);
		return authentificationService;
	}

}
