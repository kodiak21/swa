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
		
		if(person.getLanguageType() == LanguageType.GERMAN) {
			authentificationService.setCreateAnswer(questionCredentialView.showViewGer());
		
			int answer = authentificationService.getCreateAnswer();
			
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
		
		authentificationService.createAuthentification(credentialType, person, authentificationService);
		}else if(person.getLanguageType() == LanguageType.ENGLISH) {
			authentificationService.setCreateAnswer(questionCredentialView.showViewEng());
			
			int answer = authentificationService.getCreateAnswer();
			
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
			authentificationService.createAuthentification(credentialType, person, authentificationService);
		}
		
		return authentificationService;
	}

}
