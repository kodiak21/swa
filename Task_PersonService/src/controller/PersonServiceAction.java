package controller;

import model.PersonService;

/**<b> Übergeordneter Service</b>: PersonService<br>
 * 
 * <br><b>PersonServiceAction:</b> Interface, wird in allen betreffenden Aktionen des PersonService implementiert
 * 
 * 
 *
 */

public interface PersonServiceAction {
	public PersonService action(PersonService personService);
}
