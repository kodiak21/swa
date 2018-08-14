package model;

public class AuthentificationService {
	
	Person person;
	AuthentificationStrategy authentificationStrategy;
	
	CredentialType credentialType;
	LanguageType languageType;
	int deleteAnswer;

	public AuthentificationService() {
	}

	public void createAuthentification(CredentialType credentialType, Person person) {
		this.person = person;
		this.authentificationStrategy = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person);
	}
	
	public AuthentificationStrategy getAuthentificationStrategy() {
		return this.authentificationStrategy;
	}

	public boolean authentificateSubject() {
		
		if(person.getLanguageType()==LanguageType.GERMAN) {
			return authentificationStrategy.authenficateSubjectGer();
		}else if(person.getLanguageType() == LanguageType.ENGLISH) {
			return authentificationStrategy.authenficateSubjectEng();
		}
		return true;
	}
	
	public void deleteAuthentification() {
		this.authentificationStrategy = null;
	}

	public void setDeleteAnswer(int deleteAnswer) {
		this.deleteAnswer = deleteAnswer;
		
	}
	
	public int getDeleteAnswer() {
		return deleteAnswer;
	}
	
}
