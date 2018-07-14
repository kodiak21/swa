package model;

import model.Person;
import model.PersonType;
import model.UserFactory;

public class Client {

	//Authenfication nach Strategy Pattern
	
	public static void main(String[] args ) {

		String name = "John Moeller";		
		PersonType personType = PersonType.LEGALPERSON;	
		UserFactory userfactory = new UserFactory();
		Person person = userfactory.createPerson(personType,name);
		
		CredentialType credentialType;
		credentialType = CredentialType.USERNAME;


		//Ab hier beginnt Controller
		//createAuthentification (credentialType, person)
		AuthentificationStrategy authenficationMethod = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person);

		//printAuthentification(authenficationMethod);
		authenficationMethod.authenficateSubject();
		//reutrn boolean;
		
		//deleteAuthetification(authenficationMethod);
		//authenficationMethod = null;
	}
}
