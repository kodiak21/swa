package controller;

import model.PersonService;

/**Übergeordneter Service: PersonService
 * <br> 
* PersonServiceAction wird als Interface von allen Actions implementiert
**/

public interface PersonServiceAction {
	public PersonService action(PersonService personService);
}
