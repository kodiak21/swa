package controller;

import model.AuthentificationService;
import model.CredentialType;
import model.LanguageType;
import model.Person;
import view.QuestionCredentialView;

public class CreateAuthentificationAction implements AuthentificationServiceAction {

	Person person;
	QuestionCredentialView questionCredentialView;

	public CreateAuthentificationAction(Person person) {
		this.person = person;
		this.questionCredentialView = new QuestionCredentialView();
	}
	
	@Override
	public AuthentificationService action(AuthentificationService authentificationService) {
		CredentialType credentialType;
		
		if(person.getLanguage() == LanguageType.GERMAN) {
			int answer = questionCredentialView.showViewGer();
		
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
		}else if(person.getLanguage() == LanguageType.ENGLISH) {
			int answer = questionCredentialView.showViewEng();
			
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
		}
		
		return authentificationService;
	}

}
