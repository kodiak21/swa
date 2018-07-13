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

	public AuthentificationService() {
		name = "John Moeller";		
		personType = PersonType.LEGALPERSON;	
		userfactory = new UserFactory();
		person = userfactory.createPerson(personType,name);
		credentialType = CredentialType.USERNAME;
	}

	//Ab hier beginnt Controller
	public void createAuthentification(CredentialType credentialType, Person person) {
		this.authentificationStrategy = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person);
	}
	
	public AuthentificationStrategy printAuthentification() {
		return this.authentificationStrategy;
	}

	public boolean authentificateSubject() {
		return authentificationStrategy.authenficateSubject();
	}
	
	public void deleteAuthentification() {
		this.authentificationStrategy = null;
	}
}
