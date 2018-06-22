package de.leuphana.swa.authentificationService;

import de.leuphana.swa.personService.Person;
import de.leuphana.swa.personService.PersonType;
import de.leuphana.swa.personService.UserFactory;

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
		AuthenficationStrategy authenficationMethod = AuthentificationStrategyFactory.getAuthenticationMethod(credentialType, person);

		//printAuthentification(authenficationMethod);
		authenficationMethod.authenficateSubject();
		//reutrn boolean;
		
		//deleteAuthetification(authenficationMethod);
		//authenficationMethod = null;
	}
}
