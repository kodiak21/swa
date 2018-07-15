package model;
import model.Person;
import model.PersonType;
import model.UserFactory;

public class AuthentificationService {
	
	String name;		
	PersonType personType;	
	UserFactory userfactory;
	Person person;
	AuthentificationStrategy authentificationStrategy;
	
	CredentialType credentialType;
	LanguageType languageType;

	public AuthentificationService() {
		name = "John Moeller";		
		personType = PersonType.LEGALPERSON;
		languageType = LanguageType.GERMAN;
		userfactory = new UserFactory();
		person = userfactory.createPerson(personType,name, languageType);
		credentialType = CredentialType.USERNAME;
	}

	public void createAuthentification(CredentialType credentialType, Person person) {
		this.authentificationStrategy = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person);
	}
	
	public AuthentificationStrategy printAuthentification() {
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
