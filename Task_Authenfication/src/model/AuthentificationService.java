package model;

public class AuthentificationService {
	
	Person person;
	AuthentificationStrategy authentificationStrategy;
	
	CredentialType credentialType;
	LanguageType languageType;

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
		
		if(person.getLanguage()==LanguageType.GERMAN) {
			return authentificationStrategy.authenficateSubjectGer();
		}else if(person.getLanguage() == LanguageType.ENGLISH) {
			return authentificationStrategy.authenficateSubjectEng();
		}
		return true;
	}
	
	public void deleteAuthentification() {
		this.authentificationStrategy = null;
	}
	
}
